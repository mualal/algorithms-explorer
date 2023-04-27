import java.util.Scanner;


public class Task168 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inf = Integer.MAX_VALUE / 2;
		int N = in.nextInt();
		int S = in.nextInt();
		int F = in.nextInt();
		int min_vertex = S;
		S--;
		F--;
		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = in.nextInt();
				if (matrix[i][j] == -1)
					matrix[i][j] = inf;
			}
		}
		in.close();
		int[] dist = new int[N];
		for (int i = 0; i < N; i++) {
			dist[i] = inf;
		}
		dist[S] = 0;
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
		if (dist[F] == inf)
			System.out.println(-1);
		else
			System.out.println(dist[F]);
	}
}
