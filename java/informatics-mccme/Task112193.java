import java.util.Scanner;


public class Task112193 {
    
	public static long min_general_multiple(long a, long b) {
		long r = 0;
		long a_new = a;
		long b_new = b;
		while (a != 0) {
			r = b % a;
			b = a;
			a = r;
		}
		long min_general_multiple = b_new * a_new / b;
		return min_general_multiple;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextInt();
		long b = in.nextInt();
		in.close();
		System.out.println(min_general_multiple(a, b));
	}
}
