import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] arr_1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_1[i] = in.nextInt();
		}
		int[] arr_2 = new int[K];
		for (int j = 0; j < K; j++) {
			arr_2[j] = in.nextInt();
		}
		in.close();
		for (int j = 0; j < K; j++) {
			int f = 0;
			int left = 0;
			int right = N - 1;
			while (left <= right) {
				int middle = (left + right) / 2;
				if (arr_2[j] == arr_1[middle]) {
					f = 1;
					left = 2;
					right = 1;
				} else {
					if (arr_2[j] < arr_1[middle]) {
						right = middle - 1;
					} else {
						left = middle + 1;
					}
				}
			}
			if (f == 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
