import java.util.Scanner;


public class Task294 {
    
	public static void main(String[] args) {
		int x1, x2, x3;
		Scanner in = new Scanner(System.in);
		x1 = in.nextInt();
		x2 = in.nextInt();
		x3 = in.nextInt();
		if (x1 > x2) {
			if (x1 > x3) {
				System.out.println(x1);
			} else {
				System.out.println(x3);
			}
		} else {
			if (x2 > x3) {
				System.out.println(x2);
			} else {
				System.out.println(x3);
			}
		}
		in.close();
	}
}
