import java.util.Scanner;


public class Task112178 {

	public static void del(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		System.out.print(1+" ");
		del(N);
		System.out.println(N);
	}
}
