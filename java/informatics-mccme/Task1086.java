import java.util.Scanner;


public class Task1086 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr_1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_1[i] = in.nextInt();
		}
		int[] arr_2 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_2[i] = in.nextInt();
		}
		in.close();
		int[] new_1 = new int[N];
		for (int j = 0; j < N; j++) {
			int max_1 = Integer.MIN_VALUE, index_max_1 = 0;
			for (int i = 0; i < N; i++) {
				if (arr_1[i] > max_1) {
					max_1 = arr_1[i];
					index_max_1 = i;
				}
			}
			arr_1[index_max_1] = Integer.MIN_VALUE;
			int min_2 = Integer.MAX_VALUE, index_min_2 = 0;
			for (int i = 0; i < N; i++) {
				if (arr_2[i] < min_2) {
					min_2 = arr_2[i];
					index_min_2 = i;
				}
			}
			arr_2[index_min_2] = Integer.MAX_VALUE;
			new_1[index_max_1] = index_min_2 + 1;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(new_1[i] + " ");
		}
	}
}
