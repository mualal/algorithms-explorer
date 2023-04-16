import java.util.Scanner;


public class Task1426 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] capacity = new int[N * M];
		for (int i = 0; i < N * M; i++) {
			capacity[i] = in.nextInt();
		}
		int K = in.nextInt();
		int[] people = new int[K];
		for (int i = 0; i < K; i++) {
			people[i] = in.nextInt();
		}
		in.close();
		int number = 0;
		int help, j;

		for (int i = 1; i < N * M; i++) {
			help = capacity[i];
			j = i - 1;
			while (j >= 0 && help < capacity[j]) {
				capacity[j + 1] = capacity[j];
				j--;
			}
			capacity[j + 1] = help;
		}

		for (int i = 1; i < K; i++) {
			help = people[i];
			j = i - 1;
			while (j >= 0 && help < people[j]) {
				people[j + 1] = people[j];
				j--;

			}
			people[j + 1] = help;
		}

		for (int k = 0; k < K; k++) {
			for (int i = 0; i < N * M; i++) {
				if (people[k] <= capacity[i]) {
					number++;
					capacity[i] = Integer.MIN_VALUE;
					break;

				}
			}
		}
		System.out.println(number);
	}
}
