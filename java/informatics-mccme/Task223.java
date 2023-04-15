import java.util.Scanner;


public class Task223 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int x = in.nextInt();
		int k = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == x) {
				k++;
			}
		}
		System.out.println(k);
		in.close();
	}
}
