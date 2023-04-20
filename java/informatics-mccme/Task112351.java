import java.util.Scanner;


public class Task112351 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		char[] array = s1.toCharArray();
		double hex = 0;
		for (char i = 0; i < array.length; i++) {
			if (array[i] == 'A') {
				array[i] = 10;
			}
			if (array[i] == 'B') {
				array[i] = 11;
			}
			if (array[i] == 'C') {
				array[i] = 12;
			}
			if (array[i] == 'D') {
				array[i] = 13;
			}
			if (array[i] == 'E') {
				array[i] = 14;
			}
			if (array[i] == 'F') {
				array[i] = 15;
			}
			if (array[i] == '1') {
				array[i] = 1;
			}
			if (array[i] == '2') {
				array[i] = 2;
			}
			if (array[i] == '3') {
				array[i] = 3;
			}
			if (array[i] == '4') {
				array[i] = 4;
			}
			if (array[i] == '5') {
				array[i] = 5;
			}
			if (array[i] == '6') {
				array[i] = 6;
			}
			if (array[i] == '7') {
				array[i] = 7;
			}
			if (array[i] == '8') {
				array[i] = 8;
			}
			if (array[i] == '9') {
				array[i] = 9;
			}
			if (array[i] == '0') {
				array[i] = 0;
			}
		}

		if (array[0] != '-') {
			for (int i = 0; i < array.length; i++) {
				hex = hex + array[array.length - i - 1] * Math.pow(16, i);
			}
			System.out.println((int) hex);
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				hex = hex + array[array.length - i - 1] * Math.pow(16, i);
			}
			System.out.println("-" + (int) hex);
		}
	}
}
