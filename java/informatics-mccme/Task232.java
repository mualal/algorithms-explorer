import java.util.Scanner;


public class Task232 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int help, j;
		for (int i = 1; i < N; i++) {
			help = arr[i];
			j = i - 1;
			while (j >= 0 && help < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = help;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
