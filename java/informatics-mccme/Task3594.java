import java.util.Scanner;


public class Task3594 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] coordinates = new int[2 * N];
		for (int i = 0; i < 2 * N; i++) {
			coordinates[i] = in.nextInt();
		}
		in.close();

		int t = 0;
		int[] new_1 = new int[N];
		for (int i = 0; i < 2 * N; i = i + 2) {
			new_1[t] = coordinates[i];
			t++;

		}
		int help, j;
		for (int i = 1; i < N; i++) {
			help = new_1[i];
			j = i - 1;
			while (j >= 0 && help < new_1[j]) {
				new_1[j + 1] = new_1[j];
				j--;

			}
			new_1[j + 1] = help;
		}
		int z = 0;
		for (int i = 0; i < N - 1; i++) {
			if (new_1[i] != new_1[i + 1]) {
				z++;
			}
		}
		System.out.println(z + 1);
	}
}
