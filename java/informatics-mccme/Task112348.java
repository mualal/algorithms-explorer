import java.util.Scanner;


public class Task112348 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		String s3 = in.nextLine();
		in.close();
		s1 = s1.replace(s2, s3);
		System.out.println(s1);
	}
}
