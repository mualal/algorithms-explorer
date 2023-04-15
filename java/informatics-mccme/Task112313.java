import java.util.Scanner;


public class Task112313 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] % 10 > arr[j + 1] % 10) {
					sort = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++)
			System.out.print(arr[i] + " ");
	}
}
