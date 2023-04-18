import java.util.Scanner;


public class Task112365 {

	public static int number(int a) {
		int number = 0;
		while (a != 0) {
			a = a / 10;
			number++;
		}
		return (number);
	}

	public static int sum(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		return (sum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int K = in.nextInt();
		int R = in.nextInt();
		in.close();
		N = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (number(matrix[i][j]) == K && sum(matrix[i][j]) % R == 0) {
					N++;
				}
			}
		}
		System.out.println(N);
	}
}
