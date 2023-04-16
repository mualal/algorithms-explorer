import java.util.Scanner;


public class Task1436 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int temp, j;
		boolean flag;
		for (int i = 1; i < N; i++) {
			flag = false;
			temp = arr[i];
			j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
				flag = true;
			}
			if (flag == true) {
				arr[j + 1] = temp;
				for (int k = 0; k < N; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
