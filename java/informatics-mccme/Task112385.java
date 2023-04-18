import java.util.Scanner;


public class Task112385 {

	public static void output(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
				sum = sum + matrix[i][j];
			}
		}
		in.close();
		double medium = (double) sum / (double) (N * M);
		System.out.println(medium);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < medium) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 255;
				}
			}
		}
		output(matrix);
	}
}
