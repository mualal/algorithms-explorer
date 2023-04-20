import java.util.Scanner;


public class Task112336 {
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		in.close();
		int n = 0;
		char[] array = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (array[i] == 'a') {
				n++;
				array[i] = 'b';
			}
		}
		System.out.println(array);
		System.out.println(n);
	}
}
