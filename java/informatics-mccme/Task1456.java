import java.util.Scanner;


public class Task1456 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int number = in.nextInt();
		in.close();
		int n=1;
		for (int i = N - 1; i >= 0; i--) {
			if (arr[i] >= number) {
				n = i + 2;
				break;
			}
		}
		System.out.println(n);
	}
}
