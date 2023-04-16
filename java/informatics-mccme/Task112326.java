import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task112326 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int z = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] % 2 != 0) {
				z++;
			}
		}
		int t = 0;
		int[] new_1 = new int[z];
		for (int i = 0; i < N; i++) {
			if (arr[i] % 2 != 0) {
				new_1[t] = arr[i];
				t++;
			}
		}
		t = 0;
		int help, j;
		for (int i = 1; i < z; i++) {
			help = new_1[i];
			j = i - 1;
			while (j >= 0 && help < new_1[j]) {
				new_1[j + 1] = new_1[j];
				j--;
			}
			new_1[j + 1] = help;
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] = new_1[t];
				t++;
			}
		}
		PrintWriter output = new PrintWriter(new File("output.txt"));
		for (int i = 0; i < N; i++) {
			output.print(arr[i] + " ");
		}
		output.close();
	}
}
