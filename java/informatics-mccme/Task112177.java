import java.util.Scanner;


public class Task112177 {
    
	public static void numbers(int a) {
		int n = 0;
		if (a == 0) {
			System.out.println(0);
		} else {
			int a_new = a;
			while (a_new != 0) {
				a_new = a_new / 10;
				n++;
			}
			int k = 0;
			for (int i = n; i > 0; i--) {
				k = a / ((int) Math.pow(10, i - 1));
				a = a % ((int) Math.pow(10, i - 1));

				System.out.println(k);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		numbers(N);
	}
}
