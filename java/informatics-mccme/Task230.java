import java.util.Scanner;


public class Task230 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int index_max, max;
		for (int i = N - 1; i >= 1; i--) {
			index_max = i;
			max = arr[i];
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > max) {
					index_max = j;
					max = arr[j];
				}
			}
			if (index_max != i) {
				arr[index_max] = arr[i];
				arr[i] = max;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
