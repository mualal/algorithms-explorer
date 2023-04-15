import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task233 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();

		}
		in.close();
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					sort = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		PrintWriter output = new PrintWriter(new File("output.txt"));
		for (int i = 0; i < N; i++) {
			output.print(arr[i] + " ");
		}
		output.close();
	}
}
