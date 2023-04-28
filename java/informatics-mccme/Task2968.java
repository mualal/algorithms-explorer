import java.util.LinkedList;
import java.util.Scanner;


public class Task2968 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<Integer>();
		int N = in.nextInt();
		in.close();
		int[] array = new int[N + 1];
		int[] number = new int[N + 1];
		if (N > 1) {
			array[2] = 1;
			number[2] = 1;
			if (N > 2) {
				array[3] = 1;
				number[3] = 3;
				for (int i = 4; i < N + 1; i++) {
					if (i % 3 == 0 && i % 2 == 0) {
						int min = Math.min(array[i / 3], array[i / 2]);
						array[i] = Math.min(min, array[i - 1]) + 1;
						if (Math.min(min, array[i - 1]) == array[i / 3]) {
							number[i] = 3;
						}
						if (Math.min(min, array[i - 1]) == array[i / 2]) {
							number[i] = 2;
						}
						if (Math.min(min, array[i - 1]) == array[i - 1]) {
							number[i] = 1;
						}
					} else {
						if (i % 3 == 0) {
							array[i] = Math.min(array[i / 3], array[i - 1]) + 1;
							if (Math.min(array[i / 3], array[i - 1]) == array[i / 3]) {
								number[i] = 3;
							} else {
								number[i] = 1;
							}
						} else {
							if (i % 2 == 0) {
								array[i] = Math.min(array[i / 2], array[i - 1]) + 1;
								if (Math.min(array[i / 2], array[i - 1]) == array[i / 2]) {
									number[i] = 2;
								} else {
									number[i] = 1;
								}
							} else {
								array[i] = array[i - 1] + 1;
								number[i] = 1;
							}
						}
					}
				}
			}
		}
		while (number[N] != 0) {
			q.addFirst(number[N]);
			if (number[N] != 1) {
				N /= number[N];
			} else {
				N -= 1;
			}
		}
		while (!q.isEmpty()) {
			System.out.print(q.poll());
		}
	}
}
