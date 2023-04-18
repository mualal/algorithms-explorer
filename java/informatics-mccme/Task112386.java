import java.util.Scanner;


public class Task112386 {

	public static Scanner in = new Scanner(System.in);

	public static int[][] input() {
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		return (matrix);
	}

	public static void output(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = input();
		int K = in.nextInt();
		K = K - 1;
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int i = 0; i < matrix.length - 1; i++) {
				if (matrix[i][K] < matrix[i + 1][K]) {
					sort = false;
					for (int j = 0; j < matrix[i].length; j++) {
						int temp = matrix[i][j];
						matrix[i][j] = matrix[i + 1][j];
						matrix[i + 1][j] = temp;
					}
				}
			}
		}
		output(matrix);
	}
}
