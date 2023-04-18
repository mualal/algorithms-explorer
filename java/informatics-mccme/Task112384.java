import java.util.Scanner;


public class Task112384 {
    
	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = matrix[0].length - 1; i >= 0; i--) {
			for (int j = 0; j < matrix.length; j++) {
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
