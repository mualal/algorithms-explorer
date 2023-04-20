import java.util.Scanner;


public class Task109 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		char[] array_str = str.toCharArray();
		boolean flag = false;
		for (int i = 0; i < array_str.length; i++) {
			for (int j = i + 1; j < array_str.length; j++) {
				if (array_str[i] == array_str[j]) {
					flag = true;
					System.out.print(array_str[i]);
					break;
				}
			}
			if (flag) {
				break;
			}
		}
	}
}
