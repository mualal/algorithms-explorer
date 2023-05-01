import java.util.Scanner;


public class Task112609 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int[] array = new int[N + 5];
		array[0] = 2;
		array[1] = 4;
		array[2] = 7;
		for (int i = 3; i < N; i++) {
			array[i] = array[i - 3] + array[i - 2] + array[i - 1];
		}
		System.out.println(array[N - 1]);
	}
}
