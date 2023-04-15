import java.util.Scanner;


public class Task2937 {
	
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner (System.in);
		x = in.nextInt();
		System.out.println("The next number for the number " + x + " is " + (++x) + ".");
		System.out.println("The previous number for the number "+ (--x) + " is " + (--x) + ".");
	}
}
