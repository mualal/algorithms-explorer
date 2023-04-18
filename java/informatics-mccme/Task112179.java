// ошибка оформления кода

import java.util.Scanner;


public class Task112179 {

	public static String Roman_system(int a) {
		String[] roman_system = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int[] array = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		int i = 12;
		String r = "";
		while (a != 0) {
			while (a >= array[i]) {
				a = a - array[i];
				r = r + roman_system[i];
			}
			i = i - 1;
		}
		return (r);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		System.out.println(Roman_system(N));
	}
}
