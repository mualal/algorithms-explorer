from datetime import datetime
import random


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
    symbols = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !,.?',
    desired_phrase = 'Genetic algorithms are very useful!',
) -> None:
    conv_to_phrase = ConvergenceToPhrase(available_symbols=symbols, desired_output=desired_phrase)
    print(conv_to_phrase.get_the_best())


if __name__ == '__main__':
    main_for_convergence_to_phrase()
