import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task3044 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int N = in.nextInt();
		int[] arr_1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_1[i] = in.nextInt();
		}
		in.close();
		int[] count = new int[N];
		for (int i = N - 1; i >= 1; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr_1[i] < arr_1[j]) {
					count[j]++;
				} else {
					count[i]++;
				}
			}
		}
		int[] arr_2 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_2[count[i]] = arr_1[i];
		}

		PrintWriter output = new PrintWriter(new File("output.txt"));
		for (int i = 0; i < N; i++) {
			output.print(arr_2[i] + " ");
		}
		output.close();
	}
}
