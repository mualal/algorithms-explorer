import java.util.Scanner;


public class Task471 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n + 1];
		int m = in.nextInt();
		for (int i = 0; i < 2 * m; i++) {
			array[in.nextInt()]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(array[i + 1]);
		}
		in.close();
	}
}
