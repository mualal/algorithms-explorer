import java.util.Scanner;


public class Task112198 {

	public static int sum(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		return (sum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		for (int i = a; i <= b; i++) {
			if (sum(i) == sum(2 * i) && sum(2 * i) == sum(3 * i) && sum(3 * i) == sum(4 * i) && sum(4 * i) == sum(5 * i)
					&& sum(5 * i) == sum(6 * i) && sum(6 * i) == sum(7 * i) && sum(7 * i) == sum(8 * i)
					&& sum(8 * i) == sum(9 * i)) {

				System.out.print(i + " ");
			}
		}
	}
}
