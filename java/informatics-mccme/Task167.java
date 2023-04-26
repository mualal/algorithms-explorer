import java.util.Scanner;


public class Task167 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] array = new int[N];
		int help_1;
		int help_2;
		for (int i = 0; i < N; i++) {
			help_1 = in.nextInt();
			help_2 = in.nextInt();
			if (help_2 == 1)
				array[i] = help_1;
		}
		in.close();
		int max = -1;
		int max_number = -2;
		for (int i = 0; i < N; i++) {
			if (array[i] > max && array[i] != 0) {
				max = array[i];
				max_number = i;
			}
		}
		System.out.println(max_number + 1);
	}
}
