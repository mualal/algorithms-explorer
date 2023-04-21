import java.util.Scanner;


public class Task111835 {

	static int Ak;

	public static int ak(int m, int n) {
		if (m == 0) {
			return (n + 1);
		} else {
			if (n == 0) {
				return (ak(m - 1, 1));
			} else {
				return (ak(m - 1, ak(m, n - 1)));
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		in.close();
		System.out.println(ak(m, n));
	}
}
