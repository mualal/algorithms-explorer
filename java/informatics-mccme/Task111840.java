import java.util.Scanner;


public class Task111840 {

	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int[][] matrix;
	static int number;
	static boolean[] used;
	static int[] d;

	public static void DFS(int v) {
		used[v] = true;
		for (int j = 1; j < N + 1; j++) {
			if (!used[j] && matrix[j][v] == 1) {
				d[j] = d[v] + 1;
				DFS(j);
			}
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
		d = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			d[i] = -1;
		}
		d[start] = 0;
		DFS(start);
		int max = d[1];
		int number_max = 1;
		for (int i = N; i > 0; i--) {
			if (d[i] >= max) {
				max = d[i];
				number_max = i;
			}
		}
		System.out.println(number_max);
	}
}
