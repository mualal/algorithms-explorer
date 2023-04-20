import java.util.Scanner;


public class Task112359 {

	public static void TumbaWords(char[] a, char[] w, int b) {
		if (b == w.length) {
			boolean flag = false;
			for (int i = 0; i < w.length; i++) {
				for (int j = 0; j < w.length; j++) {
					if (w[i] == a[0] && j != i && w[j] == a[0]) {
						flag = true;
					}
				}
			}
			if (flag) {
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
		System.out.println(
				(int) (Math.pow(s1.length(), K) - Math.pow(s1.length() - 1, K) - K * Math.pow(s1.length() - 1, K - 1)));
	}
}
