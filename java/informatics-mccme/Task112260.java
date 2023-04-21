import java.util.Scanner;


public class Task112260 {

	static Scanner in = new Scanner(System.in);

	public static void solve(boolean flag) {
		int N = in.nextInt();
		if (N != 0) {
			if ((int) Math.pow(Math.round(Math.sqrt(N)), 2) == N) {
				flag = true;
			}
			solve(flag);
			if ((int) Math.pow(Math.round(Math.sqrt(N)), 2) == N) {
				System.out.print(N + " ");
			}
		} else {
			if (!flag) {
				System.out.println(0);
			}
		}
	}

	public static void main(String[] args) {
		solve(false);
	}
}
