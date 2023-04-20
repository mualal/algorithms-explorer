import java.util.Scanner;


public class Task112345 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		s1 = s1.replace('\\', ' ');
		String[] array = s1.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
