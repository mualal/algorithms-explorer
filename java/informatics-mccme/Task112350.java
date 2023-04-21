import java.util.Scanner;


public class Task112350 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String expansion = in.nextLine();
		in.close();
		str = str.replace(".", ":");
		String[] array = str.split(":");
		if (array.length == 1) {
			System.out.print(str + "." + expansion);
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + ".");
			}
			System.out.println(expansion);
		}
	}
}
