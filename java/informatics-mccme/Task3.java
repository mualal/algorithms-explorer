import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double N = in.nextInt();
		in.close();
		int ask = 0;
		while (N > 1) {
			N = N / 2;
			ask++;
		}
		System.out.println(ask);
	}
}
