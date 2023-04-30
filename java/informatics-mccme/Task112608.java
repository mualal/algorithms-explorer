import java.util.Scanner;


public class Task112608 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int[] array = new int[N + 10];
		array[0] = 1;
		array[1] = 4;
		array[2] = 6;
		for (int i = 3; i < N + 5; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		System.out.println(array[N - 1]);
	}
}
