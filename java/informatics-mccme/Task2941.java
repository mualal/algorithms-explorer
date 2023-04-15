import java.util.Scanner;


public class Task2941 {
    
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		System.out.println(x - (x / 10) * 10);
	}
}
