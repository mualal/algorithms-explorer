import java.util.Scanner;


public class Task475 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		int n = in.nextInt();
		int[] array = new int[n + 1];
		int m = in.nextInt();
		for (int i = 0; i < 2 * m; i++) {
			array[in.nextInt()]++;
		}
		for (int i = 2; i < n + 1; i++) {
			if (array[i - 1] != array[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
			in.close();
		}
	}
}
