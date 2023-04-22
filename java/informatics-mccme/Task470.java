import java.util.Scanner;


public class Task470 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < n; i++) {
			number = 0;
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1)
					number++;
			}
			System.out.println(number);
		}
	}
}
