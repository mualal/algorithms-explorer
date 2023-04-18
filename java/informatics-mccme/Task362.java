import java.util.Scanner;


public class Task362 {

	public static int sum(int[][] New, int n, int k) {
		int sum = 0;
		for (int j = 0; j <= k; j++) {
			sum = sum + New[n][j];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int[][] Pascal = new int[n][m];
		for (int i = 0; i < Pascal[0].length; i++) {
			Pascal[0][i] = 1;
		}
		for (int i = 1; i < Pascal.length; i++) {
			for (int j = 0; j < Pascal[i].length; j++) {
				Pascal[i][j] = sum(Pascal, i - 1, j);
			}
		}
		for (int i = 0; i < Pascal.length; i++) {
			for (int j = 0; j < Pascal[i].length; j++) {
				System.out.print(Pascal[i][j] + " ");
			}
			System.out.println();
		}
	}
}
