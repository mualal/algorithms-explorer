import java.util.Scanner;


public class Task112294 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE, index = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
				index = i;
			}
		}
		arr[index] = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (arr[i] < min2) {
				min2 = arr[i];
				index = i;
			}
		}
		arr[index] = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (arr[i] < min3) {
				min3 = arr[i];
			}
		}
		System.out.print(min1 + " " + min2 + " " + min3);
		in.close();
	}
}
