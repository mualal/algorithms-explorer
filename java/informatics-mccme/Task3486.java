import java.util.Scanner;


public class Task3486 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] array = str.toCharArray();
		int one = 0;
		int two = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				one++;
			} else {
				one--;
				if (one < 0) {
					two++;
					one = 0;
				}
			}
		}
		System.out.println(one + two);
		in.close();
	}
}
