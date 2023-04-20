import java.util.Scanner;


public class Task112347 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		int n = s1.indexOf(" ");
		int m = s1.lastIndexOf(" ");
		char[] array = s1.toCharArray();
		System.out.print(array[n + 1] + "." + array[m + 1] + ". ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]);
		}
	}
}
