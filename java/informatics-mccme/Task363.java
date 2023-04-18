import java.util.Scanner;


public class Task363 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int[][] array = new int[n][m];
		n = 0;
		for (int i = 0; i < array.length; i = i + 2) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = n;
				n++;
			}
			n = n + m;
		}
		n = m;
		for (int i = 1; i < array.length; i = i + 2) {
			for (int j = array[i].length - 1; j >= 0; j--) {
				array[i][j] = n;
				n++;
			}
			n = n + m;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
