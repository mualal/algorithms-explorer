import java.util.Scanner;


public class Task176 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		int number = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 1 && array[i] != array[j]) {
					number++;
				}
			}
		}
		System.out.println(number / 2);
	}
}
