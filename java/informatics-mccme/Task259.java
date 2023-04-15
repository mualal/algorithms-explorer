import java.util.Scanner;


public class Task259 {

	public static void main(String[] args) {
		int k;
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		if ((k % 4) == 0 || k == 1) {
			System.out.println("YES");
        } else {
			System.out.println("NO");
        }
		in.close();
	}
}
