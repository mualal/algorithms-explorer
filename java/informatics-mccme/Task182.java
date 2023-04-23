import java.util.LinkedList;
import java.util.Scanner;


public class Task182 {

	static Scanner in = new Scanner(System.in);
	static int[][] matrix;
	static int[] d;
	static int N = in.nextInt();
	static int M = in.nextInt();

	public static void BFS(int start) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		d[start] = 0;
		q.add(start);
		while (!q.isEmpty()) {
			int z = q.removeFirst();
			for (int j = 1; j < N + 1; j++) {
				if (matrix[z][j] == 1 && d[j] == -1) {
					System.out.println(z + " " + j);
					d[j] = d[z] + 1;
					q.add(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a;
		int b;

		d = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			d[i] = -1;
		}
		matrix = new int[N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				matrix[i][j] = 0;
			}
		}
		for (int i = 0; i < M; i++) {
			a = in.nextInt();
			b = in.nextInt();
			matrix[a][b] = 1;
			matrix[b][a] = 1;
		}
		BFS(1);
	}
}
