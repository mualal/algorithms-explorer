import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Task112325 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int[] new_1_1 = new int[N / 2];
		int[] new_1_2 = new int[N / 2];
		int[] new_2_1 = new int[N / 2 + 1];
		int[] new_2_2 = new int[N / 2];
		int k = 0;
		if (N % 2 == 0) {
			for (int i = 0; i < N; i = i + 2) {
				new_1_1[k] = arr[i];
				k++;
			}
			k = 0;
			for (int i = 1; i < N; i = i + 2) {
				new_1_2[k] = arr[i];
				k++;
			}
			int help, j;
			for (int i = 1; i < N / 2; i++) {
				help = new_1_1[i];
				j = i - 1;
				while (j >= 0 && help < new_1_1[j]) {
					new_1_1[j + 1] = new_1_1[j];
					j--;
				}
				new_1_1[j + 1] = help;
			}
			for (int i = 1; i < N / 2; i++) {
				help = new_1_2[i];
				j = i - 1;
				while (j >= 0 && help < new_1_2[j]) {
					new_1_2[j + 1] = new_1_2[j];
					j--;
				}
				new_1_2[j + 1] = help;
			}
			int temp;
			for (int i = 0; i < N / 4; i++) {
				temp = new_1_2[i];
				new_1_2[i] = new_1_2[N / 2 - i - 1];
				new_1_2[N / 2 - i - 1] = temp;
			}
			k = 0;
			for (int i = 0; i < N; i = i + 2) {
				arr[i] = new_1_1[k];
				k++;
			}
			k = 0;
			for (int i = 1; i < N; i = i + 2) {
				arr[i] = new_1_2[k];
				k++;
			}

			PrintWriter output = new PrintWriter(new File("output.txt"));
			for (int i = 0; i < N; i++) {
				output.print(arr[i] + " ");
			}
			output.close();
		} else {
			for (int i = 0; i < N; i = i + 2) {
				new_2_1[k] = arr[i];
				k++;
			}
			k = 0;
			for (int i = 1; i < N; i = i + 2) {
				new_2_2[k] = arr[i];
				k++;
			}
			int help, j;
			for (int i = 1; i < N / 2 + 1; i++) {
				help = new_2_1[i];
				j = i - 1;
				while (j >= 0 && help < new_2_1[j]) {
					new_2_1[j + 1] = new_2_1[j];
					j--;
				}
				new_2_1[j + 1] = help;
			}
			Arrays.sort(new_2_2);
			int temp;
			for (int i = 0; i < N / 4; i++) {
				temp = new_2_2[i];
				new_2_2[i] = new_2_2[N / 2 - i - 1];
				new_2_2[N / 2 - i - 1] = temp;
			}
			k = 0;
			for (int i = 0; i < N; i = i + 2) {
				arr[i] = new_2_1[k];
				k++;
			}
			k = 0;
			for (int i = 1; i < N; i = i + 2) {
				arr[i] = new_2_2[k];
				k++;
			}

			PrintWriter output = new PrintWriter(new File("output.txt"));
			for (int i = 0; i < N; i++) {
				output.print(arr[i] + " ");
			}
			output.close();
		}
	}
}
