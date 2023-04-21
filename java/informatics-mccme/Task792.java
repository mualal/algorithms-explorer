import java.util.Scanner;


public class Task792 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		char[] array = str.toCharArray();
		if (array.length % 3 == 0) {
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i]);
				if ((i + 1) % 3 == 0) {
					System.out.print(",");
				}
			}
			System.out.print(array[array.length - 1]);
		}
		if (array.length % 3 == 1) {
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i]);
				if (i % 3 == 0) {
					System.out.print(",");
				}
			}
			System.out.println(array[array.length - 1]);
		}
		if (array.length % 3 == 2) {
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i]);
				if ((i - 1) % 3 == 0) {
					System.out.print(",");
				}
			}
			System.out.println(array[array.length - 1]);
		}
	}
}
