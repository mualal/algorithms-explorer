import java.util.Scanner;


public class Task359 {

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
		int max = 0;
		for (int i = 0; i < sport.length; i++) {
			for (int j = 0; j < sport[i].length; j++) {
				if (sport[i][j] > max) {
					max = sport[i][j];
				}
			}
		}
		n = 0;
		for (int i = 0; i < sport.length; i++) {
			for (int j = 0; j < sport[i].length; j++) {
				if (sport[i][j] == max) {
					n++;
					break;
				}
			}
		}
		System.out.println(n);
	}
}
