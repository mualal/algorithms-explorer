import java.util.Scanner;


public class Task112390 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N + 2][M + 2];
		for (int i = 1; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix[i].length - 1; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = -2;
			matrix[i][matrix[0].length - 1] = -2;
		}
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[0][j] = -2;
			matrix[matrix.length - 1][j] = -2;
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
		int n = 0;
		for (int i = 1; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1 && matrix[i - 1][j] != -1 && matrix[i + 1][j] != -1 && matrix[i][j - 1] != -1
						&& matrix[i][j + 1] != -1) {
					n++;
					matrix[i][j] = -1;
				} else {
					if (matrix[i][j] == 1) {
						matrix[i][j] = -1;
					}
				}
			}
		}
		System.out.println(n);
	}
}
