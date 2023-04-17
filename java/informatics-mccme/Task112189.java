import java.util.Scanner;


public class Task112189 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		int min_1 = Math.min(a, b);
		int min_2 = Math.min(b, c);
		int min = Math.min(min_1, min_2);
		System.out.println(min);
	}
}
