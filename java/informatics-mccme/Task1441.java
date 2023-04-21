import java.util.Scanner;


public class Task1441 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a = in.nextInt();
		int j;
		for (int i = 1; i < N; i++) {
			j = in.nextInt();
			while (a * j != 0) {
				if (a > j) {
					a = a % j;
				} else {
					j = j % a;
				}
			}
			a = a + j;
		}
		in.close();
		System.out.println(a);
	}
}
