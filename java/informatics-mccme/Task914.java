import java.util.Scanner;


public class Task914 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long Z = in.nextLong();
		in.close();
		switch ((int) Z) {
		case 1:
			System.out.println("3");
			break;
		case 2: {
			System.out.println("8");
			break;
		}
		default: {
			long[] array = new long[(int) Z];
			array[0] = 3;
			array[1] = 8;
			for (int i = 2; i < Z; i++) {
				array[i] = 2 * (array[i - 2] + array[i - 1]);
			}
			System.out.println(array[(int) (Z - 1)]);
		}
		}
	}
}
