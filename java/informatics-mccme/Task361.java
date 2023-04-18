import java.util.Scanner;


public class Task361 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int[][] table = new int[n][m];
		int i = 0, j = 0;
		while (i != n - 1 || j != m - 1) {
			table[i][j] = i * j;
			if (j == m - 1) {
				j = 0;
				i++;
			} else {
				j++;
			}
		}
		table[n - 1][m - 1] = (n - 1) * (m - 1);
		i = 0;
		j = 0;
		while (i != n - 1 || j != m - 1) {
			System.out.print(table[i][j] + " ");
			if (j == m - 1) {
				j = 0;
				i++;
				System.out.println();
			} else {
				j++;
			}
		}
		System.out.print(table[n - 1][m - 1]);
	}
}
