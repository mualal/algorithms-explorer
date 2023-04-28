import java.util.Scanner;


public class Task2963 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int[] array = new int[N + 1];
		if (N > 1) {
			array[2] = 1;
			if (N > 2) {
				array[3] = 1;
				for (int i = 4; i < N + 1; i++) {
					if (i % 3 == 0 && i % 2 == 0) {
						int min = Math.min(array[i / 3], array[i / 2]);
						array[i] = Math.min(min, array[i - 1]) + 1;
					} else {
						if (i % 3 == 0) {
							array[i] = Math.min(array[i / 3], array[i - 1]) + 1;
						} else {
							if (i % 2 == 0) {
								array[i] = Math.min(array[i / 2], array[i - 1]) + 1;
							} else {
								array[i] = array[i - 1] + 1;
							}
						}
					}
				}
			}
		}
		System.out.println(array[N]);
	}
}
