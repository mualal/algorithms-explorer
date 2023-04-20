import java.util.Scanner;


public class Task112349 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		in.close();
		int n = 0;
		s1 = s1.replace(s2, " ");
		char[] array = s1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				n++;
			}
		}
		System.out.println(n);
	}
}
