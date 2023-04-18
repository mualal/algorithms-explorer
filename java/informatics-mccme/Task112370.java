import java.util.Scanner;


public class Task112370 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		return (matrix);
	}

	public static void main(String[] args) {
		int[][] symmetry = input();
		boolean flag = true;
		for (int i = 0; i < symmetry.length; i++) {
			for (int j = 0; j < symmetry[i].length; j++) {
				if (symmetry[i][j] != symmetry[j][i]) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}
}
