import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;


public class Task56 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter output = new PrintWriter(new File("output.txt"));
		Stack<Integer> stack = new Stack<Integer>();
		String str = "begin";
		while (!str.equals("exit")) {
			str = sc.next();
			if (str.equals("push")) {
				stack.push(sc.nextInt());
				output.println("ok");
			}
			if (str.equals("pop")) {
				if (stack.size() != 0)
					output.println(stack.pop());
				else
					output.println("error");
			}

			if (str.equals("back"))
				if (stack.size() != 0)
					output.println(stack.peek());
				else
					output.println("error");

			if (str.equals("size"))
				output.println(stack.size());

			if (str.equals("clear")) {
				stack.clear();
				output.println("ok");
			}

			if (str.equals("exit")) {
				output.println("bye");
			}
		}
		sc.close();
		output.close();
	}
}
