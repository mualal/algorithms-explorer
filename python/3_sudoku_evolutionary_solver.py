import random
from datetime import datetime
from bisect import bisect_left
from math import exp


class Chromosome:
    genome = None
    fitness = None
    age = 0

    def __init__(
            self,
            genome,
            fitness,
    ) -> None:
        self.genome = genome
        self.fitness = fitness

    def __str__(self):
        return f' Genome: {self.genome}.\n Fitness: {self.fitness}.'


class GeneticMachineryForSudoku:

    def __init__(
            self,
            available_genes_set: list,
            get_fitness,
            initial_genome: list,
            optimal_fitness,
            printing,
    ) -> None:
        self.available_genes_set = available_genes_set
        self.get_fitness = get_fitness
        self.initial_genome = initial_genome
        self.mutable_genes_indices = [i for i, gene in enumerate(initial_genome) if gene == 0]
        self.optimal_fitness = optimal_fitness
        self.printing = printing

    def _generate_parent(
            self,
    ) -> Chromosome:
        genome = self.initial_genome.copy()
        for i, _ in enumerate(genome):
            if genome[i] == 0:
                genome[i] = random.choice(self.available_genes_set)
        fitness = self.get_fitness(genome)
        return Chromosome(genome=genome, fitness=fitness)

    def _mutate(
            self,
            parent: Chromosome,
    ) -> Chromosome:
        index = random.choice(self.mutable_genes_indices)
        child_genome = parent.genome[:]
        new_gene, alternate = random.sample(self.available_genes_set, 2)
        child_genome[index] = alternate if new_gene == child_genome[index] else new_gene
        index_a, index_b = random.sample(self.mutable_genes_indices, 2)
        child_genome[index_a], child_genome[index_b] = child_genome[index_b], child_genome[index_a]
        fitness = self.get_fitness(child_genome)
        return Chromosome(genome=child_genome, fitness=fitness)

    def get_the_best(
            self,
            genetic_line_max_age=None
    ) -> Chromosome:
        random.seed(42)
        start_time = datetime.now()
        best_parent = self._generate_parent()
        historical_fitnesses = [best_parent.fitness]
        while True:
            child = self._mutate(best_parent)
            if best_parent.fitness > child.fitness:
                if genetic_line_max_age is None:
                    continue
                best_parent.age += 1
                if genetic_line_max_age > best_parent.age:
                    continue
                # if genetic line maximum age is reached
                child_fitness_index = bisect_left(historical_fitnesses, child.fitness)
                best_and_child_diff = len(historical_fitnesses) - child_fitness_index
                similar_prop = best_and_child_diff / len(historical_fitnesses)
                # new best parent selection based on child with very differ (relative to current genetic line) fitness
                if random.random() < exp(-similar_prop):
                    best_parent = child
                    continue
                best_parent.age = 0
                continue
            if not child.fitness > best_parent.fitness:
                child.age = best_parent.age + 1
                best_parent = child
                continue
            self.printing(current_generation=child, start_time=start_time)
            best_parent = child
            best_parent.age = 0
            if child.fitness > best_parent.fitness:
                best_parent = child
                historical_fitnesses.append(child.fitness)
            if not self.optimal_fitness > child.fitness:
                return best_parent


class FitnessForSudoku:
    total = None

    def __init__(self, total):
        self.total = total

    def __gt__(self, other):
        return self.total < other.total

    def __str__(self):
        return f'{self.total}'


def get_fitness_for_sudoku(
        genome,
) -> FitnessForSudoku:
    violation_sum = 0
    for i in range(9):
        violation_sum += 9 - len(set(genome[i::9]))
        violation_sum += 9 - len(set(genome[i * 9:(i + 1) * 9]))
    for i in [0, 1, 2]:
        for j in [0, 9, 18]:
            violation_sum += 9 - len(set(genome[0 + 3 * (i + j):3 + 3 * (i + j)] +
                                         genome[9 + 3 * (i + j):12 + 3 * (i + j)] +
                                         genome[18 + 3 * (i + j):21 + 3 * (i + j)]))
    return FitnessForSudoku(total=violation_sum)


def printing_for_sudoku(
    current_generation: Chromosome,
    start_time: datetime,
) -> None:
    time_diff = datetime.now() - start_time

    print(f'Genome: {current_generation.genome}')
    print(f'Fitness: {current_generation.fitness}. Time: {time_diff}.')


def main_for_sudoku(
        sudoku_puzzle,
) -> None:
    initial_genome = [item for row in sudoku_puzzle for item in row]
    sudoku_genetic_machinery = GeneticMachineryForSudoku(
        available_genes_set=[i for i in range(1, 10)],
        get_fitness=get_fitness_for_sudoku,
        initial_genome=initial_genome,
        optimal_fitness=FitnessForSudoku(0),
        printing=printing_for_sudoku,
    )
    sudoku_genetic_machinery.get_the_best(genetic_line_max_age=50000)


if __name__ == '__main__':
    main_for_sudoku(
        sudoku_puzzle=[
            [0, 0, 0, 0, 0, 9, 4, 7, 0],
            [0, 0, 2, 0, 3, 0, 0, 9, 8],
            [0, 6, 0, 0, 0, 2, 0, 0, 1],
            [0, 0, 0, 0, 0, 0, 5, 0, 7],
            [0, 7, 0, 0, 0, 0, 0, 6, 0],
            [8, 0, 3, 0, 0, 0, 0, 0, 0],
            [6, 0, 0, 1, 0, 0, 0, 2, 0],
            [7, 4, 0, 0, 6, 0, 9, 0, 0],
            [0, 1, 9, 4, 0, 0, 0, 0, 0],
        ]
    )
