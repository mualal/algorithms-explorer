import java.util.Scanner;


public class Task112338 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		in.close();
		int n = 0;
		char[] array = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (array[i] == 'a') {
				n++;
				array[i] = '7';
			}
			if (array[i] == 'A') {
				n++;
				array[i] = '8';
			}
			if (array[i] == 'b') {
				n++;
				array[i] = 'a';
			}
			if (array[i] == 'B') {
				n++;
				array[i] = 'A';
			}
			if (array[i] == '7') {
				array[i] = 'b';

			}
			if (array[i] == '8') {
				array[i] = 'B';
			}
		}
		System.out.println(array);
		System.out.println(n);
	}
}
