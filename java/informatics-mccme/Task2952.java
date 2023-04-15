import java.util.Scanner;


public class Task2952 {
    
	public static void main(String[] args) {
		int x1, x2, x3, y1, y2, y3;
		Scanner in = new Scanner(System.in);
		x1 = in.nextInt();
		x2 = in.nextInt();
		x3 = in.nextInt();
		y1 = in.nextInt();
		y2 = in.nextInt();
		y3 = in.nextInt();
		System.out.println(y1 * 3600 + y2 * 60 + y3 - x1 * 3600 - x2 * 60 - x3);
	}
}
