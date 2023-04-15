import java.util.Scanner;


public class Task71 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int temp = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		in.close();
	}
}
