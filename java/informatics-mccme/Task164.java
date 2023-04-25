import java.util.Scanner;


public class Task164 {

	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int[][] matrix;
	static int number;
	static boolean[] used;

	public static void DFS(int v) {
		used[v] = true;
		number++;
		for (int j = 1; j < N + 1; j++) {
			if (!used[j] && matrix[j][v] == 1)
				DFS(j);
		}
	}

	public static void main(String[] args) {
		int start = in.nextInt();
		matrix = new int[N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		used = new boolean[N + 1];
		DFS(start);
		System.out.println(number);
	}
}
