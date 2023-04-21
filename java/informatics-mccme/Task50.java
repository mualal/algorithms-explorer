import java.util.LinkedList;
import java.util.Scanner;


public class Task50 {

	public static void main(String[] args) {
		int n = 0;
		LinkedList<Integer> q_1 = new LinkedList<Integer>();
		LinkedList<Integer> q_2 = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			q_1.offer(in.nextInt());
		}
		for (int i = 0; i < 5; i++) {
			q_2.offer(in.nextInt());
		}
		in.close();
		while (!q_1.isEmpty() && !q_2.isEmpty()) {
			if ((q_1.peek() > q_2.peek() || (q_1.peek() == 0 && q_2.peek() == 9)) && q_1.peek() != 9) {
				q_1.offer(q_1.poll());
				q_1.offer(q_2.poll());
				n++;
			} else {
				if (q_1.peek() == 9) {
					if (q_2.peek() == 0) {
						q_2.offer(q_1.poll());
						q_2.offer(q_2.poll());
						n++;
					} else {
						q_1.offer(q_1.poll());
						q_1.offer(q_2.poll());
						n++;
					}
				} else {
					q_2.offer(q_1.poll());
					q_2.offer(q_2.poll());
					n++;
				}
			}
			if (n == 1000000) {
				System.out.println("botva");
				break;
			}
		}
		if (n < 1000000) {
			if (q_1.isEmpty())
				System.out.println("second" + " " + n);
			if (q_2.isEmpty())
				System.out.println("first" + " " + n);
		}
	}
}
