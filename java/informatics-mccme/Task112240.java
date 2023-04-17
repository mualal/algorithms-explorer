import java.util.Scanner;


public class Task112240 {

	public static void perfect_number(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		if (a == sum) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		perfect_number(N);
	}
}
