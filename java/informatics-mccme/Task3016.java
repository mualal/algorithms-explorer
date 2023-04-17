import java.util.Scanner;


public class Task3016 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] grade = new int[N + 2];
		for (int i = 1; i < N + 1; i++) {
			grade[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < N + 1; i++) {
			if (grade[i] == 4 && (grade[i - 1] == 5 || grade[i + 1] == 5)) {
				grade[i] = 6;
			}
		}
		for (int i = 0; i < N + 1; i++) {
			if (grade[i] == 3 && (grade[i - 1] == 5 || grade[i + 1] == 5)) {
				grade[i] = 6;
			}
		}
		for (int i = 0; i < N+1; i++) {
			if ((grade[i] == 3 && grade[i - 1] == 4 && grade[i + 1] != 5)
					|| (grade[i] == 3 && grade[i + 1] == 4 && grade[i - 1] != 5)) {
				grade[i] = 7;
			}
		}
		for (int i = 0; i < N+1; i++) {
			if (grade[i] == 2 && (grade[i - 1] == 5 || grade[i + 1] == 5)) {
				grade[i] = 6;
			}
		}
		for (int i = 0; i < N+1; i++) {
			if ((grade[i] == 2 && grade[i - 1] == 4 && grade[i + 1] != 5)
					|| (grade[i] == 2 && grade[i + 1] == 4 && grade[i - 1] != 5)) {
				grade[i] = 7;
			}
		}
		for (int i = 0; i < N+1; i++) {
			if ((grade[i] == 2 && grade[i - 1] == 3 && grade[i + 1] != 4 && grade[i + 1] != 5)
					|| (grade[i] == 2 && grade[i + 1] == 3 && grade[i - 1] != 4 && grade[i - 1] != 5)) {
				grade[i] = 8;
			}
		}
		for (int i=0;i<N+1;i++){
			if (grade[i]==6){
				grade[i]=5;
			}
			if (grade[i]==7){
				grade[i]=4;
			}
			if (grade[i]==8){
				grade[i]=3;
			}
		}

		for (int i = 1; i < N + 1; i++) {
			System.out.println(grade[i] + " ");
		}
	}
}
