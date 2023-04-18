import java.util.Scanner;


public class Task112364 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int matrix[][] = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int K = in.nextInt();
		in.close();
		int n = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == K) {
					n++;
				}
			}
		}
		System.out.println(n);
	}
}
