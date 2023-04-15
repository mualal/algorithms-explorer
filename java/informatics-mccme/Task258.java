import java.util.Scanner;


public class Task258 {

	public static void main(String[] args) {
		int n, m, k;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		if (((k % n == 0) || (k % m == 0)) && (k <= m * n)) {
			System.out.println("YES");
        } else {
            System.out.println("NO");
        }
		in.close();
	}
}
