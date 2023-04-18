import java.util.Scanner;


public class Task112368 {
    
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

	public static int max(int[][] arr) {
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

	public static void main(String[] args) {
		int[][] matrix = input();
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == max(matrix)) {
					for (int k = 0; k < matrix.length; k++) {
						System.out.print(matrix[k][i] + " ");
					}
					System.out.println();
					break;
				}
			}
		}
	}
}
