import java.util.Scanner;


public class Task357 {

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
		int max = Integer.MIN_VALUE, index_i = 0, index_j = 0;
		for (int i = sport.length - 1; i >= 0; i--) {
			for (int j = sport[i].length - 1; j >= 0; j--) {
				if (sport[i][j] >= max) {
					max = sport[i][j];
					index_i = i;
					index_j = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(index_i);
		System.out.println(index_j);
	}
}
