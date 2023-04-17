import java.util.Scanner;


public class Task112192 {
    
	public static int max_general_divisor(int a, int b) {
		int r = 0;
		while (a != 0) {
			r = b % a;
			b = a;
			a = r;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		System.out.println(max_general_divisor(a, b));
	}
}
