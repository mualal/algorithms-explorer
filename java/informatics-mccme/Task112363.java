import java.io.IOException;
import java.util.Scanner;


public class Task112363 {
    
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int matrix[][] = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum = sum + matrix[i][j];

			}
		}
		System.out.println(sum);
	}
}
