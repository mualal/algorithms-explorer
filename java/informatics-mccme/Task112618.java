import java.util.Scanner;


public class Task112618 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		in.close();
		if (B >= A) {
			int[] array = new int[B + 5];
			array[A] = 1;
			for (int i = A + 1; i <= B; i++) {
				array[i] = array[i - 1];
				if (i % 3 == 0) {
					array[i] += array[i / 3];
				}
			}
			System.out.println(array[B]);
		} else {
			System.out.println(0);
		}
	}
}
