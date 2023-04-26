import java.util.Scanner;


public class Task169 {

	public static void main(String[] args) {
		int inf = Integer.MAX_VALUE / 2;
		int help_1;
		int help_2;
		int min_vertex = 0;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = in.nextInt();
		}
		int[][] matrix = new int[N][N];
		int M = in.nextInt();
		for (int i = 0; i < M; i++) {
			help_1 = in.nextInt() - 1;
			help_2 = in.nextInt() - 1;
			matrix[help_1][help_2] = array[help_1];
			matrix[help_2][help_1] = array[help_2];
		}
		in.close();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0)
					matrix[i][j] = inf;
			}
		}
		int[] dist = new int[N];
		for (int i = 0; i < N; i++) {
			dist[i] = inf;
		}
		dist[0] = 0;
		boolean[] colour = new boolean[N];
		for (int i = 0; i < N; i++) {
			colour[i] = false;
		}
		while (true) {
			int min_dist = inf;
			for (int i = 0; i < N; i++) {
				if (colour[i] == false && dist[i] < min_dist) {
					min_dist = dist[i];
					min_vertex = i;
				}
			}
			if (min_dist == inf) {
				break;
			}
			colour[min_vertex] = true;
			for (int j = 0; j < N; j++) {
				if (dist[min_vertex] + matrix[min_vertex][j] < dist[j]) {
					dist[j] = dist[min_vertex] + matrix[min_vertex][j];
				}
			}
		}
		if (dist[N - 1] == inf)
			System.out.println(-1);
		else
			System.out.println(dist[N - 1]);
	}
}
