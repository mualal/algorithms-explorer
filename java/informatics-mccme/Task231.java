import java.util.Scanner;


public class Task231 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N + 1];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int number = in.nextInt();
		int place = in.nextInt();
		in.close();

		for (int i = N; i > place - 1; i--) {
			arr[i] = arr[i - 1];

		}

		arr[place - 1] = number;
		for (int i = 0; i < N + 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
