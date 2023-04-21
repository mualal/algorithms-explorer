import java.util.Scanner;


public class Task112450 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		boolean[] array = new boolean[n + 1];
		for (int i = 0; i < n + 1; i++) {
			array[i] = true;
		}
		int j, k = 2;
		while (k * k <= n) {
			if (array[k]) {
				j = k * k;
				while (j <= n) {
					array[j] = false;
					j = j + k;
				}
			}
			k = k + 1;
		}
		for (int i = 2; i < n + 1; i++) {
			if (array[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
