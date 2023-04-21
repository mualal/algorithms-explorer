import java.util.Scanner;


public class Task2767 {
    
	public static char[] r(char[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			char temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return (array);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str_1 = in.nextLine();
		char[] array_1 = str_1.toCharArray();
		array_1 = r(array_1);
		String str_2 = in.nextLine();
		char[] array_2 = str_2.toCharArray();
		array_2 = r(array_2);
		String str_3 = in.nextLine();
		char[] array_3 = str_3.toCharArray();
		array_3 = r(array_3);
		String str_4 = in.nextLine();
		char[] array_4 = str_4.toCharArray();
		array_4 = r(array_4);
		in.close();
		int n = 0;
		int m = 0;
		for (int i = 0; i < Math.min(array_1.length, array_3.length); i++) {
			if (array_1[i] != array_3[i]) {
				break;
			} else {
				n++;
			}
		}
		for (int i = 0; i < Math.min(array_2.length, array_4.length); i++) {
			if (array_2[i] != array_4[i]) {
				break;
			} else {
				m++;
			}
		}
		System.out.println(Math.max(n, m));
	}
}
