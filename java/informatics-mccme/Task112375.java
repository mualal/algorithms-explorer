import java.util.Scanner;


public class Task112375 {
    
	public static void output(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		in.close();
		int[][] matrix = new int[N][M];
		N = 1;
		for (int i = 0; i < matrix.length; i = i + 2) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = N;
				N++;
			}
			N = N + M;
		}
		N = M + 1;
		for (int i = 1; i < matrix.length; i = i + 2) {
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				matrix[i][j] = N;
				N++;
			}
			N = N + M;
		}
		output(matrix);
	}
}
