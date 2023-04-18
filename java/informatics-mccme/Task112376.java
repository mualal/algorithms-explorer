import java.util.Scanner;


public class Task112376 {
    
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
		in.close();
		int[][] matrix = new int[N][M];
		M = 1;
		for (int i = 0; i < matrix[0].length; i = i + 2) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[j][i] = M;
				M++;
			}
			M = N + M;
		}
		M = matrix.length + 1;
		for (int i = 1; i < matrix[0].length; i = i + 2) {
			for (int j = matrix.length - 1; j >= 0; j--) {
				matrix[j][i] = M;
				M++;
			}
			M = N + M;
		}
		output(matrix);
	}
}
