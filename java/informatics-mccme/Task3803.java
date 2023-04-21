import java.util.Scanner;


public class Task3803 {

	public static int C(int n, int k) {
		if (n == k || k == 0) {
			return (1);
		} else {
			return (C(n - 1, k - 1) + C(n - 1, k));
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		in.close();
		System.out.println(C(n, k));
	}
}
