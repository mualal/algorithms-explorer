import java.math.BigInteger;
import java.util.Scanner;


public class Task207 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		BigInteger a = BigInteger.valueOf(2);
		BigInteger b = BigInteger.valueOf(3);
		for (int i = 2; i < N; i++) {
			BigInteger help = b;
			b = a.add(b);
			a = help;
		}
		if (N == 1) {
			System.out.println("2");
		} else {
			if (N == 0) {
				System.out.println("0");
			} else {
				System.out.println(b);
			}
		}
	}
}
