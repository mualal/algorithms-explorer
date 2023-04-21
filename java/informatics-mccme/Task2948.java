import java.util.Scanner;


public class Task2948 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		s = s % 86400;
		System.out.print(s / 3600 + ":");
		s = s % 3600;
		if (s / 60 < 10) {
			System.out.print(0);
		}
		System.out.print(s / 60 + ":");
		s = s % 60;
		if (s < 10) {
			System.out.print(0);
		}
		System.out.print(s);
		in.close();
	}
}
