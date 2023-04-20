import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Task111 {

	public static void main(String[] args) throws IOException {
		int x = 0;
		int y = 0;
		Scanner in = new Scanner(new File("input.txt"));
		while (in.hasNext()) {
			String str = in.nextLine();
			String[] array_str = str.split(" ");
			if (array_str[0].equals("North")) {
				y = y + Integer.parseInt(array_str[1]);
			}
			if (array_str[0].equals("South")) {
				y = y - Integer.parseInt(array_str[1]);
			}
			if (array_str[0].equals("East")) {
				x = x + Integer.parseInt(array_str[1]);
			}
			if (array_str[0].equals("West")) {
				x = x - Integer.parseInt(array_str[1]);
			}
		}
		in.close();
		System.out.println(x + " " + y);
	}
}
