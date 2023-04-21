import java.util.Scanner;


public class Task3801 {

	static int help = 0;

	public static int sum(int a, int b) {
		if (help == b) {
			return a;
		} else {
			help++;
			a++;
			return (sum(a, b));
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		System.out.println(sum(a, b));
	}
}
