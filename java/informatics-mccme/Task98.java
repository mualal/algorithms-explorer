import java.util.Scanner;


public class Task98 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int matrix[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][j] = 10000000;
				}
			}
		}
		in.close();
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (matrix[i][j] > matrix[i][k] + matrix[k][j]) {
						matrix[i][j] = matrix[i][k] + matrix[k][j];
					}
				}
			}
		}
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			if (matrix[i][i] != 10000000)
				flag = true;
		}
		if (flag)
			System.out.println(1);
		else {
			System.out.println(0);

		}
	}
}
