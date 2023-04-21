import java.util.Scanner;


public class Task112212 {
	
	public static int even(char[] array, int z, int n) {
		if (z == array.length) {
			return n;
		} else {
			if (array[z] % 2 == 0) {
				n++;
				return even(array, z + 1, n);
			} else {
				{
					return even(array, z + 1, n);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		char[] array = str.toCharArray();
		System.out.println(even(array, 0, 0));
	}
}
