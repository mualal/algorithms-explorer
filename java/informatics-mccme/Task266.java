import java.util.Scanner;


public class Task266 {

	public static void main(String[] args) {
		double x1, y1, x2, y2;
		Scanner in = new Scanner(System.in);
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		if ((x1 / x2 > 0) && (y1 / y2 > 0)){
			System.out.println("YES");
        } else {
			System.out.println("NO");
		}
		in.close();
	}
}
