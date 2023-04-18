import java.util.Scanner;


public class Task112372 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ((i % 2 != 0 && j % 2 == 0) || ((i % 2 == 0) && (j % 2 != 0))) {
					matrix[i][j] = 1;
				}
			}
		}
		in.close();
		return (matrix);
	}

	public static void output(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = input();
		output(matrix);
	}
}
