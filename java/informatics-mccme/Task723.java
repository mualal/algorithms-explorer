import java.util.Scanner;


public class Task723 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		char[] array_str = str.toCharArray();
		for (int i = 0; i < str.length(); i = i + 2) {
			if (array_str[i] != '#') {
				System.out.print(array_str[i]);
			}
		}
		if (array_str.length % 2 == 0) {
			for (int i = str.length() - 1; i >= 0; i = i - 2) {
				if (array_str[i] != '#') {
					System.out.print(array_str[i]);
				}
			}
		} else {
			for (int i = str.length() - 2; i >= 0; i = i - 2) {
				if (array_str[i] != '#') {
					System.out.print(array_str[i]);
				}
			}
		}
	}
}
