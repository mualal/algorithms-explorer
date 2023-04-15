import java.util.Arrays;
import java.util.Scanner;


public class Task112309 {

	public static boolean value(int[] arr_1, int[] arr_3, int val) {
		for (int i = 0; i < arr_1.length; i++) {
			if (arr_1[i] * arr_3[i] == val)
				return true;

		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr_1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr_1[i] = in.nextInt();
		}
		in.close();
		int[] arr_2 = new int[N];
		System.arraycopy(arr_1, 0, arr_2, 0, arr_1.length);
		Arrays.sort(arr_2);
		int[] arr_3 = new int[N];
		Arrays.fill(arr_3, 1);
		boolean program = false;
		for (int i = 0; i < N; i++) {
			arr_3[i] = 0;
			boolean found = value(arr_1, arr_3, arr_1[i]);
			if (found) {
				program = true;
				System.out.print(arr_1[i]+" ");
				for (int j = i; j < N; j++) {
					if (arr_1[j] == arr_1[i])
						arr_3[j] = 0;
				}
			}
		}
		if (!program)
			System.out.print(0);
	}
}
