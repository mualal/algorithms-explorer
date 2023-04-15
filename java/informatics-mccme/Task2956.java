import java.util.Scanner;


public class Task2956 {
    
	public static void main(String[] args) {
		int k;
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		System.out.println((k / 1000) * 10 + (k % 1000) / 100 - ((k % 10) * 10 + (k % 100) / 10) + 1);
		in.close();
	}
}
