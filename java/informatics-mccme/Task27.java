import java.util.Scanner;


public class Task27 {
    
	public static int Nod(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (a * b == 0) {
			return (a + b);
		}
		if (a > b) {
			return (Nod(b, a % b));
		} else
			return (Nod(a, b % a));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		System.out.println((x / Nod(x, y)) + " " + (y / Nod(x, y)));
	}
}
