import java.util.Scanner;


public class Task2944 {
    
	public static void main(String[] args) {
		int x, a, b, c;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		a = (x - (x / 10) * 10);
		b = (x - (x / 100) * 100 - a) / 10;
		c = x / 100;
		System.out.println(a + b + c);
	}
}
