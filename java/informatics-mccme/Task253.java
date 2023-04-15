import java.util.Scanner;


public class Task253 {
    
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if (((x % 4 == 0) && (x % 100 != 0)) || x % 400 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
