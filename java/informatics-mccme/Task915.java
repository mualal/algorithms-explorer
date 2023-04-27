import java.util.Scanner;


public class Task915 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] cost = new int[N];
		for (int i = 0; i < N; i++) {
			cost[i] = in.nextInt();
		}
		in.close();
		switch (N) {
		case 1:
			System.out.println(cost[0]);
			break;
		case 2:
			System.out.println(cost[1]);
			break;
		default:
			int[] sum_min = new int[N];
			sum_min[0] = cost[0];
			sum_min[1] = cost[1];
			for (int i = 2; i < N; i++) {
				sum_min[i] = cost[i] + Math.min(sum_min[i - 1], sum_min[i - 2]);
			}
			System.out.println(sum_min[N - 1]);
		}
	}
}
