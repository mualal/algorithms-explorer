import java.util.Scanner;
import java.util.Stack;


public class Task51 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] array = str.toCharArray();
		Stack<Character> st = new Stack<Character>();
		boolean check = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(' || array[i] == '[' || array[i] == '{') {
				st.push(array[i]);
			}
			if (st.empty()) {
				check = false;
				break;
			}
			if ((array[i] == ')' && (char) st.peek() != '(') || (array[i] == ']' && (char) st.peek() != '[')
					|| (array[i] == '}' && (char) st.peek() != '{')) {
				check = false;
				break;
			}
			if ((array[i] == ')' && (char) st.peek() == '(') || (array[i] == ']' && (char) st.peek() == '[')
					|| (array[i] == '}' && (char) st.peek() == '{')) {
				st.pop();
			}
		}
		if (st.empty() && check)
			System.out.println("yes");
		else
			System.out.println("no");
		in.close();
	}
}
