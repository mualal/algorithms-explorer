import java.util.Scanner;


public class Task356 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] sport = new int[n][m];
		for (int i = 0; i < sport.length; i++) {
			for (int j = 0; j < sport[i].length; j++) {
				sport[i][j] = in.nextInt();
			}
		}
		in.close();
		int sum = 0, sum_1 = 0, index = n;
		for (int i = sport.length - 1; i >= 0; i--) {
			sum = 0;
			for (int j = 0; j < sport[i].length; j++) {
				sum = sum + sport[i][j];
			}
			if (sum >= sum_1) {
				sum_1 = sum;
				index = i;
			}
		}
		System.out.println(sum_1);
		System.out.println(index);
	}
}
