import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;


public class Task1748 {

	static Scanner in = new Scanner(System.in);
	static int[][] matrix;
	static int[] d;

	public static void BFS(int start) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		d[start] = 0;
		q.add(start);
		while (!q.isEmpty()) {
			int v = q.removeFirst();
			if (v + 3 < 1001 && d[v + 3] == -1) {
				d[v + 3] = d[v] + 1;
				q.add(v + 3);
			}
			if (4 * v < 1001 && d[4 * v] == -1) {
				d[4 * v] = d[v] + 1;
				q.add(4 * v);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		d = new int[1001];
		for (int i = 1; i < 1001; i++) {
			d[i] = -1;
		}
		BFS(a);
		PrintWriter output = new PrintWriter(new File("output.txt"));
		output.println(d[b]);
		output.close();
	}
}
