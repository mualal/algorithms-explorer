import java.util.Scanner;


public class Task2947 {
    
	public static void main(String[] args) {
		int x, a;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		a = (x - ((x / 1440) * 1440)) / 60;
		System.out.println((a) + " " + ((x - (x / 1440) * 1440) - a * 60));
	}
}
