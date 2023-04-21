import java.util.Scanner;


public class Task112267 {
    
	public static char max(char[] array, int x, char z) {
		if (x == array.length - 1) {
			return z;
		} else {
			if (array[x + 1] > z) {
				z = array[x + 1];
			}
			return max(array, x + 1, z);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		char[] array = str.toCharArray();
		System.out.println(max(array, 0, array[0]));
	}
}
