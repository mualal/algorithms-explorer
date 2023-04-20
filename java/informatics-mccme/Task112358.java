import java.util.Scanner;


public class Task112358 {

	public static void TumbaWords(char[] a, char[] w, int b) {
		if (b == w.length) {
			if (w[1] == a[0]) {
				System.out.println(w);
			}
			return;
		}
		for (int i = 0; i < a.length; i++) {
			w[b] = a[i];
			TumbaWords(a, w, b + 1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int K = in.nextInt();
		in.close();
		char[] array_s1 = s1.toCharArray();
		char[] array_word = new char[K];
		TumbaWords(array_s1, array_word, 0);
		System.out.println((int) Math.pow(s1.length(), K - 1));
	}
}
