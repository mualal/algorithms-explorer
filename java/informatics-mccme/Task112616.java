import java.util.LinkedList;
import java.util.Scanner;


public class Task112616 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<Integer>();
		int N = in.nextInt() + 1;
		in.close();
		int[] number = new int[N];
		int[] can = new int[N];
		number[0] = 0;
		can[0] = 0;
		for (int i = 1; i < Math.min(N, 5); i++) {
			number[i] = i;
			can[i] = 1;
		}
		if (N >= 6) {
			number[5] = 1;
			can[5] = 5;
			for (int i = 6; i < N; i++) {
				int a = Math.min(number[i - 1], number[i - 5]);
				int min = Math.min(a, number[i - 6]);
				if (min == number[i - 1]) {
					can[i] = 1;
				} else {
					if (min == number[i - 5]) {
						can[i] = 5;
					} else {
						can[i] = 6;
					}
				}
				number[i] = 1 + min;
			}
			System.out.println(number[N - 1]);

			while (can[N - 1] != 0) {
				q.addFirst(can[N - 1]);
				N = N - can[N - 1];
			}
			while (!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
		} else {
			System.out.println(number[N - 1]);
			if (N != 6) {
				for (int i = 0; i < N - 1; i++) {
					System.out.print(can[N - 1] + " ");
				}
			} else {
				System.out.println(can[N - 1]);
			}
		}
	}
}
