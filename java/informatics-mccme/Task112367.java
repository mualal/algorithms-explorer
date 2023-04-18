import java.util.Scanner;


public class Task112367 {
    
	public static int sum(int n, int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr[0].length; i++) {
			sum = sum + arr[n][i];
		}
		return (sum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int matrix[][] = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int sum = Integer.MAX_VALUE;
		int number = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (sum(i, matrix) < sum) {
				number = i;
				sum = sum(i, matrix);
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(matrix[number][i] + " ");
		}
		in.close();
	}
}
