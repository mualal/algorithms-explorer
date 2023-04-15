import java.util.Scanner;


public class Task1411 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int n = 0;
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					sort = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					n++;
				}
			}
		}
		System.out.println(n);
	}
}
