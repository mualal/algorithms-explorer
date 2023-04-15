import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task39 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int size = in.nextInt();
		int number = in.nextInt();
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int j = 0; j < number - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					sort = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int n = 0;
		int t = 0;
		for (int i = 0; i < number; i++) {
			while (n != 1) {
				if (arr[i] >= size && arr[i] < size + 3) {
					size = arr[i];
					n = 1;
				}
				t++;
				if (t > number) {
					break;
				}
			}
		}
		for (int i = 0; i < number; i++) {
			if (arr[i] >= size + 3) {
				size = arr[i];
				n++;
			}
		}
		PrintWriter output = new PrintWriter(new File("output.txt"));
		output.print(n);
		output.close();
	}
}
