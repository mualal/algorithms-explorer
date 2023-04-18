import java.util.Scanner;


public class Task112379 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		return (matrix);
	}

	public static boolean check(int[][] arr) {
		boolean flag = true;
		int sum_1 = 0;
		for (int i = 0; i < arr[0].length; i++) {
			sum_1 = sum_1 + arr[0][i];
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			if (sum != sum_1) {
				flag = false;
			}
			sum = 0;
		}
		sum = 0;
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j][i];
			}
			if (sum != sum_1) {
				flag = false;
			}
			sum = 0;
		}
		int k = 0;
		sum = 0;
		while (k != arr.length) {
			sum = sum + arr[k][k];
			k++;
		}
		if (sum != sum_1) {
			flag = false;
		}
		sum = 0;
		k = 0;
		while (k != arr.length) {
			sum = sum + arr[k][arr.length - k - 1];
			k++;
		}
		if (sum != sum_1) {
			flag = false;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > Math.pow(arr.length, 2)) {
					flag = false;
				}
			}
		}
		return (flag);
	}

	public static void main(String[] args) {
		int matrix[][] = input();
		if (check(matrix)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
