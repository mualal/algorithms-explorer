import java.util.Scanner;


public class Task2951 {
    
	public static void main(String[] args) {
		int a, b, n, R, K;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		n = in.nextInt();
		R = a * n + b * n / 100;
		K = b * n - (b * n / 100) * 100;
		System.out.println(R + " " + K);
	}
}
