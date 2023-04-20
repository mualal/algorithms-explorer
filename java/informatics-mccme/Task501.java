import java.util.Scanner;


public class Task501 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		boolean flag_1 = false;
		if (str.length() >= 8) {
			flag_1 = true;
		}
		boolean flag_2 = false;
		char[] s = str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z') {
				flag_2 = true;
			}
		}
		boolean flag_3 = false;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'A' && s[i] <= 'Z') {
				flag_3 = true;
			}
		}
		boolean flag_4 = false;
		for (int i = 0; i < s.length; i++) {
			if (Character.isDigit(s[i])) {
				flag_4 = true;
			}
		}
		if (flag_1 && flag_2 && flag_3 && flag_4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
