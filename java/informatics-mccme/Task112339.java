import java.util.Scanner;


public class Task112339 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		int n = -1;
		String[] array = s1.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 0) {
				n = i;
				break;
			}
		}
		System.out.println(array[n]);
	}
}
