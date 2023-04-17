import java.util.Scanner;


public class Task112196 {
    
	public static int sum(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		return (sum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		if (a == sum(b) && b == sum(a)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
