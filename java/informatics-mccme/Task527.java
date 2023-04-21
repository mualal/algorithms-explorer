import java.util.Arrays;
import java.util.Scanner;


public class Task527 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = in.nextInt();
		}
		int[] copy = new int[N];
		for (int i = 0; i < N; i++) {
			copy[i] = array[i];
		}
		in.close();
		Arrays.sort(array);
		int sum = 0;
		int k = N;
		for (int i = 0; i < N; i++) {
			sum = sum + array[i] * k;
			k--;
		}
		System.out.println(sum);
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N; j++) {
				if (array[i] == copy[j]) {
					System.out.print((j + 1) + " ");
					copy[j] = -1;
				}
			}
		}
	}
}
