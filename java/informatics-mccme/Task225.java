import java.util.Scanner;


public class Task225 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int x = in.nextInt();
		int k = Math.abs(arr[0] - x);

		int answer = Math.abs(arr[0]);

		for (int i = 0; i < N; i++) {
			if (Math.abs(arr[i] - x) <= k) {
				answer = arr[i];
				k = Math.abs(arr[i] - x);
			}
		}
		System.out.println(answer);
		in.close();
	}
}
