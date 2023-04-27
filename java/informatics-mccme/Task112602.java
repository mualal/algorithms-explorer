import java.util.Scanner;


public class Task112602 {
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Z = in.nextInt();
		in.close();
		int[] array = new int[Z];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < Z; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		System.out.println(array[Z - 1]);
	}
}
