import java.util.Scanner;


public class Task118 {

	public static void reverse(String n) {
		String symb = n;
		char[] array = symb.toCharArray();

		for (int z = array.length - 1; z >= 0; z--) {
			System.out.print(array[z]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		reverse(n);
		in.close();
	}
}
