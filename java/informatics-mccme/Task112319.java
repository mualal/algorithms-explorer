import java.util.Scanner;


public class Task112319 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int z, sum;
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int j = 0; j < N - 1; j++) {
				z = arr[j];
				sum = 0;
				while (z != 0) {
					sum = sum + (z % 10);
					z /= 10;
				}
				z = arr[j + 1];
				int sum_1 = 0;
				while (z != 0) {
					sum_1 = sum_1 + (z % 10);
					z /= 10;
				}
				if (sum < sum_1) {
					sort = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
