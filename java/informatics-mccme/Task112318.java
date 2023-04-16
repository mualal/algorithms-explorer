import java.util.Scanner;


public class Task112318 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] elements = new int[N];
		for (int i = 0; i < N; i++) {
			elements[i] = in.nextInt();
		}
		in.close();
		boolean flag = false;
		int help, j;
		for (int i = 1; i < N; i++) {
			help = elements[i];
			j = i - 1;
			while (j >= 0 && help < elements[j]) {
				elements[j + 1] = elements[j];
				j--;
			}
			elements[j + 1] = help;
		}
		for (int i = N - 1; i > 0; i--) {
			if (elements[i] == elements[i - 1]) {
				flag = true;
				System.out.println(elements[i]);
				break;
			}
		}
		if (flag == false) {
			System.out.println(-1);
		}
	}
}
