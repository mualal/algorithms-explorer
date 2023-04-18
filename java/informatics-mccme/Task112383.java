import java.util.Scanner;


public class Task112383 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = matrix.length - 1; j >= 0; j--) {
				matrix[j][i] = in.nextInt();
			}
		}
		in.close();
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
		output(matrix);
	}
}
