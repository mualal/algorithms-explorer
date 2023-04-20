import java.util.Scanner;


public class Task112346 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		int n = s1.lastIndexOf(" ");
		int m = s1.indexOf(" ");
		char[] array = s1.toCharArray();
		for (int i = n + 1; i < array.length; i++) {
			System.out.print(array[i]);

		}
		System.out.print(" " + array[0] + "." + array[m + 1] + ".");
	}
}
