import java.util.Scanner;


public class Task112342 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		int n=0;
		char[] array = s1.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == ' ' && array[i + 1] != ' ') {
				n++;
			}
		}
		if (array[0] != ' ') {
			n++;
		}
		System.out.println(n);
	}
}
