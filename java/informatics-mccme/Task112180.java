import java.util.Scanner;


public class Task112180 {

	public static int[] octal_number_system(int a) {
		int[] eight = new int[10];
		int i = 0;
		while (a != 0) {
			eight[9 - i] = a % 8;
			i++;
			a = a / 8;
		}
		return (eight);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int[] new_1 = new int[10];
		new_1 = octal_number_system(N);
		for (int i = 0; i < 10; i++) {
			System.out.print(new_1[i]);
		}
	}
}
