import java.util.LinkedList;
import java.util.Scanner;


public class Task112506 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<Integer>();
		int N = in.nextInt();
		int K = in.nextInt();
		in.close();
		int k = 1;
		for (int i = 0; i < N; i++) {
			q.add(k);
			k++;
		}
		k = 1;
		while (!q.isEmpty()) {
			if (k % K != 0) {
				q.offer(q.poll());
			}
			if (k % K == 0) {
				System.out.print(q.poll() + " ");

			}
			k++;
		}
	}
}
