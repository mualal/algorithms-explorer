import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Task112323 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(arr);
		PrintWriter output = new PrintWriter(new File("output.txt"));
		output.print(arr[N / 2]);
		output.close();
	}
}
