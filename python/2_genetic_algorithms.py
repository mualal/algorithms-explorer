from datetime import datetime
import random


# 1 - random string to target string


class ConvergenceToPhrase:

    def __init__(
        self,
        available_symbols: str,
        desired_output: str,
    ) -> None:
        self.gene_set = available_symbols
        self.target = desired_output

    def _generate_parent(
        self,
        length: int,
    ) -> str:
        genes = []
        while len(genes) < length:
            # sample_size = min(length - len(genes), len(gene_set))
            # to avoid exception if len(gene_set) is less than length
            # genes.extend(random.sample(gene_set, sample_size))
            genes.append(random.choice(self.gene_set))
        return ''.join(genes)
    
    def _get_fitness(
        self,
        guess: str,
    ) -> int:
        return sum(1 for expected, actual in zip(self.target, guess) if expected == actual)

    def _mutate(
        self,
        parent: str,
    ) -> str:
        index = random.randrange(0, len(parent))
        child_genes = list(parent)
        new_gene, alternate = random.sample(self.gene_set, 2)
        child_genes[index] = alternate if new_gene == child_genes[index] else new_gene
        return ''.join(child_genes)
    
    def _print_current_generation(
        self,
        current_guess: str,
        start_time: datetime,
    ) -> None:
        time_diff = datetime.now() - start_time
        fitness = self._get_fitness(current_guess)
        print(f'{current_guess}\t{fitness}\t{time_diff}')

    def get_the_best(
        self,
    ) -> str:
        random.seed(42)
        start_time = datetime.now()
        best_parent = self._generate_parent(len(self.target))
        best_fitness = self._get_fitness(best_parent)

        while True:
            child = self._mutate(best_parent)
            child_fitness = self._get_fitness(child)
            if best_fitness >= child_fitness:
                continue
            self._print_current_generation(current_guess=child, start_time=start_time)
            best_fitness = child_fitness
            best_parent = child
            if child_fitness == len(best_parent):
                break
        return best_parent


class TestConvergenceToPhrase:

    # run with (pytest path to file) in terminal
    def test_get_the_best(self):
        symbols = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !,.?'
        desired_phrase = 'New phrase'
        conv_to_phrase = ConvergenceToPhrase(available_symbols=symbols, desired_output=desired_phrase)
        assert conv_to_phrase.get_the_best() == desired_phrase


def main_for_convergence_to_phrase(
    symbols='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !,.?',
    desired_phrase='Genetic algorithms are very useful!',
) -> None:
    conv_to_phrase = ConvergenceToPhrase(available_symbols=symbols, desired_output=desired_phrase)
    print(conv_to_phrase.get_the_best())


# Important! UNIVERSAL GENETIC MACHINERY


class Chromosome:
    genes = None
    fitness = None

    def __init__(
        self,
        genes,
        fitness,
    ) -> None:
        self.genes = genes
        self.fitness = fitness


class GeneticMachinery:

    def __init__(
        self,
        available_genes_set: list,
        get_fitness,
        genome_length: int,
        optimal_fitness,
    ) -> None:
        self.available_genes_set = available_genes_set
        self.get_fitness = get_fitness
        self.genome_length = genome_length
        self.optimal_fitness = optimal_fitness
    
    def _generate_parent(
        self,
    ) -> Chromosome:
        genes = []
        while len(genes) < self.genome_length:
            # sample_size = min(genome_length - len(genes), len(available_genes_set))
            # to avoid exception if len(available_genes_set) is less than genome_length
            # genes.extend(random.sample(available_genes_set, sample_size))
            genes.append(random.choice(self.available_genes_set))
        fitness = self.get_fitness(genes)
        return Chromosome(genes=genes, fitness=fitness)

    def _mutate(
        self,
        parent: Chromosome,
    ) -> Chromosome:
        index = random.randrange(0, len(parent.genes))
        child_genes = parent.genes[:]
        new_gene, alternate = random.sample(self.available_genes_set, 2)
        child_genes[index] = alternate if new_gene == child_genes[index] else new_gene
        fitness = self.get_fitness(child_genes)
        return Chromosome(genes=child_genes, fitness=fitness)
    
    def _print_current_generation(
        self,
        current_generation: Chromosome,
        start_time: datetime,
    ) -> None:
        time_diff = datetime.now() - start_time
        print(f'{current_generation.genes}\t{current_generation.fitness}\t{time_diff}')
    
    def get_the_best(
        self,
    ) -> Chromosome:
        random.seed(42)
        start_time = datetime.now()
        best_parent = self._generate_parent()

        while True:
            child = self._mutate(best_parent)
            if best_parent.fitness > child.fitness:
                continue
            self._print_current_generation(current_generation=child, start_time=start_time)
            best_parent = child
            if child.fitness == self.optimal_fitness:
                break
        return best_parent


# 2 - list of sorted numbers


def get_fitness_for_list_of_sorted_numbers(
    genes
):
    fitness = 1
    for i in range(1, len(genes)):
        if genes[i] > genes[i-1]:
            fitness += 1
    return fitness


def main_for_list_of_sorted_numbers(
    set_size=100,
    list_size=10,
) -> None:
    list_of_sorted_numbers = GeneticMachinery(
        available_genes_set=[i for i in range(set_size)],
        get_fitness=get_fitness_for_list_of_sorted_numbers,
        genome_length=list_size,
        optimal_fitness=list_size,
    )
    print(list_of_sorted_numbers.get_the_best())


# 3 - the 8 queens puzzle


class Board:

    def __init__(
        self,
        genes,
        edge_size,
    ) -> None:
        board = [['0'] * edge_size for _ in range(edge_size)]
        for index in range(0, len(genes), 2):
            row = genes[index]
            column = genes[index + 1]
            board[column][row] = '1'
        self.board = board
    
    def get(self, row, column):
        return self.board[column][row]

    def print(self):
        for i in range(0, len(self.board)):
            print(' '.join(self.board[i]))


def get_fitness_for_8_queens_puzzle(
    genes,
    edge_size=8
):
    board = Board(genes=genes, edge_size=edge_size)
    rows_with_queens = set()
    cols_with_queens = set()
    north_east_diagonals_with_queens = set()
    south_east_diagonals_with_queens = set()
    for row in range(edge_size):
        for col in range(edge_size):
            if board.get(row, col) == '1':
                rows_with_queens.add(row)
                cols_with_queens.add(col)
                north_east_diagonals_with_queens.add(row + col)
                south_east_diagonals_with_queens.add(edge_size - 1 - row + col)
    
    total = edge_size - len(rows_with_queens) + edge_size - len(cols_with_queens) + \
        edge_size - len(north_east_diagonals_with_queens) + edge_size - len(south_east_diagonals_with_queens)
    
    return total


def main_for_8_queens_puzzle(
    set_size=8,
    list_size=16,
) -> None:
    list_of_sorted_numbers = GeneticMachinery(
        available_genes_set=[i for i in range(set_size)],
        get_fitness=get_fitness_for_8_queens_puzzle,
        genome_length=list_size,
        optimal_fitness=list_size,
    )
    print(list_of_sorted_numbers.get_the_best())


if __name__ == '__main__':
    # main_for_convergence_to_phrase()
    main_for_list_of_sorted_numbers()
    # main_for_8_queens_puzzle()
