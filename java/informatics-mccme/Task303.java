import java.util.Scanner;


public class Task303 {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15 || n == 16 || n == 17 || n == 18 || n == 19) {
			System.out.println(n + " korov");
		} else {
			switch (n % 10) {
			case 0:
				System.out.println(n + " korov");
				break;
			case 1:
				System.out.println(n + " korova");
				break;
			case 2:
				System.out.println(n + " korovy");
				break;
			case 3:
				System.out.println(n + " korovy");
				break;
			case 4:
				System.out.println(n + " korovy");
				break;
			case 5:
				System.out.println(n + " korov");
				break;
			case 6:
				System.out.println(n + " korov");
				break;
			case 7:
				System.out.println(n + " korov");
				break;
			case 8:
				System.out.println(n + " korov");
				break;
			case 9:
				System.out.println(n + " korov");
				break;
			}
			in.close();
		}
	}
}
