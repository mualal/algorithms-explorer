import java.util.Scanner;


public class Task112344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		s1 = s1.replaceAll(" ", "");
		char[] array = s1.toCharArray();
		boolean flag = true;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1 - i]) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
