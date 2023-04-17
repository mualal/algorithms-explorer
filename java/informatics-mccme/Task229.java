import java.util.Scanner;


public class Task229 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int index_max = 0;
		for (int i = 1; i < N; i++) {
			if (arr[i] > arr[index_max]) {
				index_max = i;
			}
		}
		int temp = arr[index_max];
		arr[index_max] = arr[0];
		arr[0] = temp;
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
