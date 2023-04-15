import java.util.Scanner;


public class Task2950 {
    
	public static void main(String[] args) {
		int x, a, b;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		a = 9 + (45 * x + (x / 2) * 5 + (x - 1) / 2 * 15) / 60;
		b = (45 * x + (x / 2) * 5 + (x - 1) / 2 * 15) - ((45 * x + (x / 2) * 5 + (x - 1) / 2 * 15) / 60) * 60;
		System.out.println(a + " " + b);
	}
}
