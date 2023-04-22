import java.util.LinkedList;
import java.util.Scanner;


public class Task111649 {

	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int[][] matrix;
	static int[] d;

	public static void BFS(int start) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		d[start] = 0;
		q.add(start);
		while (!q.isEmpty()) {
			int v = q.removeFirst();
			for (int j = 1; j < N + 1; j++) {
				if (matrix[v][j] == 1 && d[j] == -1) {
					d[j] = d[v] + 1;
					q.add(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		matrix = new int[N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int start = in.nextInt();
		int finish = in.nextInt();
		d = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			d[i] = -1;
		}
		BFS(start);
		System.out.println(d[finish]);
	}
}
