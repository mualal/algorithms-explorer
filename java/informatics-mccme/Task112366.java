import java.util.Scanner;


public class Task112366 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		return (matrix);
	}

	private static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return (max);
	}

	private static int min(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return (min);
	}

	public static void main(String[] args) {
		int[][] matrix = input();
		boolean flag = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == min(matrix)) {
					System.out.println((i + 1) + " " + (j + 1) + " " + min(matrix));
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		flag = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == max(matrix)) {
					System.out.println((i + 1) + " " + (j + 1) + " " + max(matrix));
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
	}
}
