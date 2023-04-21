import java.util.Scanner;


public class Task766 {

	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int[] A = new int[N];
	static int help;

	public static void enter_array(int N) {
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
	}

	public static void outlet_array() {
		for (int i = 0; i < N; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public static void MergeSort(int left, int right) {
		int i = left;
		int j = right;
		int control = A[(i + j) / 2];
		while (i < j) {
			while (A[i] < control) {
				i++;
			}
			while (A[j] > control) {
				j--;
			}
			if (i <= j) {
				help = A[i];
				A[i] = A[j];
				A[j] = help;
				i++;
				j--;
			}
		}
		if (left < j)
			MergeSort(left, j);
		if (i < right)
			MergeSort(i, right);
	}

	public static void main(String[] args) {
		enter_array(N);
		MergeSort(0, N - 1);
		outlet_array();
	}
}
