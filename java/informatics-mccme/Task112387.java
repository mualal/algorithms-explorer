import java.util.Scanner;


public class Task112387 {

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

	public static int sum(int[][] arr, int a) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][a];
		}
		return (sum);
	}

	public static void main(String[] args) {
		int[][] matrix = input();
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int i = 0; i < matrix[0].length - 1; i++) {
				if (sum(matrix, i) < sum(matrix, i + 1)) {
					sort = false;
					for (int j = 0; j < matrix.length; j++) {
						int temp = matrix[j][i];
						matrix[j][i] = matrix[j][i + 1];
						matrix[j][i + 1] = temp;
					}
				}
			}
		}
		output(matrix);
	}
}
