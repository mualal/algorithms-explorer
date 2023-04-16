import java.util.Scanner;


public class Task111627 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int index_min, min, travel = 0, index_first = 0, indicator = 0;
		index_min = 0;
		min = arr[0];
		for (int i = 0; i < N; i++) {
			travel++;
		}
		if (travel != 0) {
			travel = 0;
			for (int i = 0; i < N; i++) {
				indicator = index_first;
				index_min = i;
				min = arr[i];
				for (int j = i + 1; j < N; j++) {
					if (arr[j] < min) {
						index_min = j;
						min = arr[j];
					}
				}
				if (i == 0 || index_first == index_min || index_first == i) {
					if (index_first == 0 || index_first == i) {

						index_first = index_min;
					} else {
						index_first = i;
					}
				}
				if (index_min != i) {
					arr[index_min] = arr[i];
					arr[i] = min;
				}
				if (index_first != indicator) {
					travel++;
				}
			}
			System.out.println(travel);
		} else {
			System.out.println(0);
		}
	}
}
