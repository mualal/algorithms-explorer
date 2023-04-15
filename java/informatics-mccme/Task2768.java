import java.util.Scanner;


public class Task2768 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}
		int min = 20;
		int max = 1;
		for (int i = 0; i < 5; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int k = 1;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == max) {
				k = i;
			}
		}
		int l = 1;
		for (int i = 4; i >= 0; i--) {
			if (arr[i] == min) {
				l = i;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (i != l && i != k) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print("(" + arr[i] + ") ");
			}

		}
		System.out.print("= " + (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] - arr[l] - arr[k]));
		in.close();
	}
}
