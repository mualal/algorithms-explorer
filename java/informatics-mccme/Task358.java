import java.util.Scanner;


public class Task358 {
	public static int sum(int[][] arr, int a) {
		int sum = 0;
		for (int j = 0; j < arr[a].length; j++) {
			sum = sum + arr[a][j];
		}
		return (sum);
	}

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
		int victory = 0;
		int sum = 0;
		for (int i = sport.length - 1; i >= 0; i--) {
			for (int j = 0; j < sport[i].length; j++) {
				if (sport[i][j] == max && sum(sport, i) >= sum) {
					victory = i;
					sum = sum(sport, i);
					break;
				}
			}
		}
		System.out.println(victory);
	}
}
