import java.util.Scanner;


public class Task1457 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		in.close();
		int[] arr = new int[N + 2];
		int k = 1;
		for (int i = 1; i < N + 1; i++) {
			arr[i] = k;
			k++;
		}
		int temp;
		for (int i = A; i <= (A + B) / 2; i++) {
			temp = arr[i];
			arr[i] = arr[B + A - i];
			arr[B + A - i] = temp;
		}
		for (int i = C; i <= (C + D) / 2; i++) {
			temp = arr[i];
			arr[i] = arr[D + C - i];
			arr[D + C - i] = temp;
		}
		for (int i = 1; i < N + 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
