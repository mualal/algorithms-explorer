import java.util.Scanner;


public class Task913 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int[] array = new int[N + 1];
		array[0] = 1;
		array[1] = 2;
		for (int i = 2; i < N + 1; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		System.out.println(array[N]);
	}
}
