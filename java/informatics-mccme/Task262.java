import java.util.Scanner;


public class Task262 {
    
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		if (b > d) {
			System.out.println((c - a - 1) + " " + (100 - b + d));
		} else {
			System.out.println((c - a) + " " + (d - b));
			in.close();
		}
	}
}
