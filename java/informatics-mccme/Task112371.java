import java.util.Scanner;


public class Task112371 {

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

	public static boolean line(int a, int b, int[][] arr) {
		boolean flag = true;
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[a][i] < arr[a][b]) {
				flag = false;
				break;
			}
		}
		return (flag);
	}

	public static boolean column(int a, int b, int[][] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][a] > arr[b][a]) {
				flag = false;
				break;
			}
		}
		return (flag);
	}

	public static void main(String[] args) {
		int[][] matrix = input();
		boolean flag = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (line(i, j, matrix) && column(j, i, matrix)) {
					System.out.println((i + 1) + " " + (j + 1));
					flag = true;
				}
			}
		}
		if (!flag) {
			System.out.println(0);
		}
	}
}
