import java.util.Scanner;


public class Task309 {

	public static boolean Election(boolean x, boolean y, boolean z) {
		if (((x || y) & z) == true || ((x || z) & y) == true) {
			return (true);
		} else {
			return (false);
		}
	}

	public static boolean New(int bin) {
		if (bin == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		in.close();
		boolean x_new, y_new, z_new;
		x_new = New(x);
		y_new = New(y);
		z_new = New(z);
		if (Election(x_new, y_new, z_new) == true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
