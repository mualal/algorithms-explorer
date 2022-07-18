from datetime import datetime
import random
import csv
import os
from pathlib import Path


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
        genome = []
        while len(genome) < length:
            # sample_size = min(length - len(genome), len(gene_set))
            # to avoid exception if len(gene_set) is less than length
            # genome.extend(random.sample(gene_set, sample_size))
            genome.append(random.choice(self.gene_set))
        return ''.join(genome)
    
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
        child_genome = list(parent)
        new_gene, alternate = random.sample(self.gene_set, 2)
        child_genome[index] = alternate if new_gene == child_genome[index] else new_gene
        return ''.join(child_genome)
    
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
    genome = None
    fitness = None

    def __init__(
        self,
        genome,
        fitness,
    ) -> None:
        self.genome = genome
        self.fitness = fitness
    
    def __str__(self):
        return f' Genome: {self.genome}.\n Fitness: {self.fitness}.'


class GeneticMachinery:

    def __init__(
        self,
        available_genes_set: list,
        get_fitness,
        genome_length: int,
        optimal_fitness,
        printing,
    ) -> None:
        self.available_genes_set = available_genes_set
        self.get_fitness = get_fitness
        self.genome_length = genome_length
        self.optimal_fitness = optimal_fitness
        self.printing = printing
    
    def _generate_parent(
        self,
    ) -> Chromosome:
        genome = []
        while len(genome) < self.genome_length:
            # sample_size = min(genome_length - len(genome), len(available_genes_set))
            # to avoid exception if len(available_genes_set) is less than genome_length
            # genome.extend(random.sample(available_genes_set, sample_size))
            genome.append(random.choice(self.available_genes_set))
        fitness = self.get_fitness(genome)
        return Chromosome(genome=genome, fitness=fitness)

    def _mutate(
        self,
        parent: Chromosome,
    ) -> Chromosome:
        index = random.randrange(0, len(parent.genome))
        child_genome = parent.genome[:]
        new_gene, alternate = random.sample(self.available_genes_set, 2)
        child_genome[index] = alternate if new_gene == child_genome[index] else new_gene
        fitness = self.get_fitness(child_genome)
        return Chromosome(genome=child_genome, fitness=fitness)
    
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
            self.printing(current_generation=child, start_time=start_time)
            best_parent = child
            if not self.optimal_fitness > child.fitness:
                return best_parent
        

# 2 - list of sorted numbers


class FitnessForListOfSortedNumbers:
    numbers_in_correct_order_count = None
    total_gap = None

    def __init__(self, numbers_in_correct_order_count, total_gap):
        self.numbers_in_correct_order_count = numbers_in_correct_order_count
        self.total_gap = total_gap
    
    def __gt__(
        self,
        other
    ):
        if self.numbers_in_correct_order_count != other.numbers_in_correct_order_count:
            return self.numbers_in_correct_order_count > other.numbers_in_correct_order_count
        return self.total_gap < other.total_gap
    
    def __str__(self):
        return f'{self.numbers_in_correct_order_count} in correct order, {self.total_gap} total gap'


def get_fitness_for_list_of_sorted_numbers(
    genome: list
) -> FitnessForListOfSortedNumbers:
    fitness = 1
    gap = 0
    for i in range(1, len(genome)):
        if genome[i] > genome[i-1]:
            fitness += 1
        else:
            gap += genome[i - 1] - genome[i]
    return FitnessForListOfSortedNumbers(
        numbers_in_correct_order_count=fitness,
        total_gap=gap
    )


def printing_for_list_of_sorted_numbers(
    current_generation: Chromosome,
    start_time: datetime,
) -> None:
    time_diff = datetime.now() - start_time
    print(f'{current_generation.genome}\t{current_generation.fitness}\t{time_diff}')


def main_for_list_of_sorted_numbers(
    set_size=100,
    list_size=10,
) -> None:
    sorted_numbers_genetic_machinery = GeneticMachinery(
        available_genes_set=[i for i in range(set_size)],
        get_fitness=get_fitness_for_list_of_sorted_numbers,
        genome_length=list_size,
        optimal_fitness=FitnessForListOfSortedNumbers(list_size, 0),
        printing=printing_for_list_of_sorted_numbers
    )
    print(sorted_numbers_genetic_machinery.get_the_best())


# 3 - queens puzzle


class Board:

    def __init__(
        self,
        genome,
        edge_size,
    ) -> None:
        board = [['0'] * edge_size for _ in range(edge_size)]
        for index in range(0, len(genome), 2):
            row = genome[index]
            column = genome[index + 1]
            board[column][row] = '1'
        self.board = board
    
    def get(self, row, column):
        return self.board[column][row]

    def print(self):
        for i in range(0, len(self.board)):
            print(' '.join(self.board[i]))


class FitnessForQueensPuzzle:
    total = None

    def __init__(self, total):
        self.total = total
    
    def __gt__(self, other):
        return self.total < other.total
    
    def __str__(self):
        return f'{self.total}'


def get_fitness_for_queens_puzzle(
    genome: list,
    edge_size: int
):
    board = Board(genome=genome, edge_size=edge_size)
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
    
    return FitnessForQueensPuzzle(total)


def printing_for_queens_puzzle(
    current_generation: Chromosome,
    start_time: datetime,
    edge_size: int,
) -> None:
    time_diff = datetime.now() - start_time
    board = Board(current_generation.genome, edge_size)
    board.print()
    print(f'{current_generation.genome}\t - {current_generation.fitness}\t{time_diff}')


def main_for_queens_puzzle(
    set_size=20,
    list_size=40,
) -> None:
    queens_puzzle_genetic_machinery = GeneticMachinery(
        available_genes_set=[i for i in range(set_size)],
        get_fitness=(lambda x: get_fitness_for_queens_puzzle(x, edge_size=set_size)),
        genome_length=list_size,
        optimal_fitness=FitnessForQueensPuzzle(0),
        printing=(lambda current_generation, start_time: printing_for_queens_puzzle(
            current_generation=current_generation,
            start_time=start_time,
            edge_size=set_size
        ))
    )
    print(queens_puzzle_genetic_machinery.get_the_best())


# 4 - simple graph coloring problem


def graph_coloring_load_data(
    file_name: str
) -> dict[str, list[str]]:
    with open(file=file_name, mode='r') as csvfile:
        reader = csv.reader(csvfile)
        lookup = {row[0]: row[1].split(';') for row in reader if row}
    return lookup


class GraphColoringRule:
    node = None
    adjacent = None

    def __init__(
        self,
        node,
        adjacent,
    ) -> None:
        if node < adjacent:
            node, adjacent = adjacent, node
        self.node = node
        self.adjacent = adjacent
    
    def __eq__(
        self,
        other,
    ) -> bool:
        return self.node == other.node and self.adjacent == other.adjacent
    
    def __hash__(
        self
    ):
        return hash(self.node) * 397 ^ hash(self.adjacent)
    
    def __str__(
        self
    ) -> str:
        return self.node + '<->' + self.adjacent
    
    def __repr__(
        self
    ) -> str:
        return str(self)

    def is_valid(
        self,
        genome: list,
        node_index_lookup: dict[str, int]
    ) -> bool:
        index = node_index_lookup[self.node]
        adjacent_state_index = node_index_lookup[self.adjacent]
        return genome[index] != genome[adjacent_state_index]


def build_graph_coloring_rules(
    items: dict[str, list[str]]
):
    rules_added = {}

    for state, adjacents in items.items():
        for adjacent in adjacents:
            if adjacent == '':
                continue
            rule = GraphColoringRule(
                node=state,
                adjacent=adjacent
            )
            if rule in rules_added:
                rules_added[rule] += 1
            else:
                rules_added[rule] = 1
    
    for k, v in rules_added.items():
        if v != 2:
            print(f'Check dataset. Rule {k} is not bidirectional')

    return rules_added.keys()


def get_fitness_for_graph_coloring(
    genome: list,
    rules,
    state_index_lookup: dict[str, int]
):
    passed_rules_count = sum(1 for rule in rules if rule.is_valid(genome, state_index_lookup))
    return passed_rules_count


def printing_for_graph_coloring(
    current_generation: Chromosome,
    start_time: datetime,
) -> None:
    time_diff = datetime.now() - start_time
    print(''.join(current_generation.genome)+f'\t{current_generation.fitness}\t{time_diff}')


def main_for_graph_coloring_problem(
    path_to_file=os.path.join(
        Path(__file__).parent.absolute(),
        'datasets',
        'states_connections.csv'
    )
) -> None:
    states = graph_coloring_load_data(path_to_file)
    rules = build_graph_coloring_rules(states)
    optimal_fitness = len(rules)
    state_index_lookup = {key: index for index, key in enumerate(sorted(states))}
    colors = ['Red', 'Green', 'Blue', 'Yellow']
    colors_lookup = {color[0]: color for color in colors}
    geneset = list(colors_lookup.keys())

    graph_coloring_genetic_machinery = GeneticMachinery(
        available_genes_set=geneset,
        get_fitness=(lambda genome: get_fitness_for_graph_coloring(
            genome=genome,
            rules=rules,
            state_index_lookup=state_index_lookup
        )),
        genome_length=len(states),
        optimal_fitness=optimal_fitness,
        printing=printing_for_graph_coloring
    )
    print(graph_coloring_genetic_machinery.get_the_best())


if __name__ == '__main__':
    # main_for_convergence_to_phrase()
    # main_for_list_of_sorted_numbers()
    # main_for_queens_puzzle()
    main_for_graph_coloring_problem()
