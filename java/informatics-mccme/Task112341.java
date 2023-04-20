import java.util.Scanner;


public class Task112341 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		int index_long = 0;
		String[] array = s1.split(" ");
		int length_str = array[0].length();
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > length_str) {
				index_long = i;
				length_str = array[i].length();
			}
		}
		System.out.println(array[index_long]);
		System.out.println(length_str);
	}
}
