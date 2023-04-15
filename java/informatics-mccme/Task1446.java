import java.util.Scanner;


public class Task1446 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[2 * N];
		for (int i = 0; i < 2 * N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int temp;
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int j = 0; j < 2 * N - 3; j = j + 2) {
				if (arr[j + 1] < arr[j + 3]) {
					sort = false;
					temp = arr[j + 1];
					arr[j + 1] = arr[j + 3];
					arr[j + 3] = temp;
					temp = arr[j];
					arr[j] = arr[j + 2];
					arr[j + 2] = temp;

				}
			}
		}
		sort = false;
		while (!sort) {
			sort = true;
			for (int i = 0; i < 2 * N - 3; i = i + 2) {
				if (arr[i + 1] == arr[i + 3]) {
					if (arr[i] > arr[i + 2]) {
						sort = false;
						temp = arr[i];
						arr[i] = arr[i + 2];
						arr[i + 2] = temp;
					}
				}
			}
		}
		for (int i = 0; i < 2 * N; i = i + 2) {
			System.out.print(arr[i] + " ");
			System.out.println(arr[i + 1]);

		}
	}
}
