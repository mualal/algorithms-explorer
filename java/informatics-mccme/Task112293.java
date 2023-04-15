import java.util.Scanner;


public class Task112293 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int k = 0, max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0 && arr[i] > 0) {
				if (arr[i] > max) {
					max = arr[i];
				}
				if (arr[i] < min) {
					min = arr[i];
				}
				k++;
			}
		}
		if (k == 0) {
			max = -1;
			min = -1;
		}
		System.out.print(min + " " + max);
		in.close();
	}
}
