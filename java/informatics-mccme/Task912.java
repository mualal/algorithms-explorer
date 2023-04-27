import java.util.Scanner;


public class Task912 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long Z = in.nextLong();
		in.close();
		long[] array = new long[(int) Z];
		switch ((int) Z) {
		case 1:
			System.out.println("2");
			break;
		case 2: {
			System.out.println("4");
			break;
		}
		default: {
			array[0] = 2;
			array[1] = 4;
			array[2] = 7;
			for (int i = 3; i < Z; i++) {
				array[i] = array[i - 3] + array[i - 2] + array[i - 1];
			}
			System.out.println(array[(int) (Z - 1)]);
		}
		}
	}
}
