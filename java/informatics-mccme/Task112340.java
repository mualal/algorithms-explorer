import java.util.Scanner;


public class Task112340 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		int left = 0;
		int right = 0;
		if (s1.indexOf(' ') != -1) {
			char[] array = s1.toCharArray();
			for (int i = array.length - 1; i >= 0; i--) {
				if (array[i] != ' ') {
					left = i;
					break;
				}
			}
			for (int i = left; i >= 0; i--) {
				if (array[i] == ' ') {
					right = i;
					break;
				}
			}
			for (int i = right + 1; i < left + 1; i++) {
				System.out.print(array[i]);
			}
		} else {
			System.out.println(s1);
		}
	}
}
