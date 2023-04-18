import java.util.Scanner;


public class Task355 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] symmetry = new int[n][n];
		for (int i = 0; i < symmetry.length; i++) {
			for (int j = 0; j < symmetry[i].length; j++) {
				symmetry[i][j] = in.nextInt();
			}
		}
		in.close();
		boolean flag = true;
		for (int i = 0; i < symmetry.length; i++) {
			for (int j = 0; j < symmetry[i].length; j++) {
				if (symmetry[i][j] != symmetry[j][i]) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
