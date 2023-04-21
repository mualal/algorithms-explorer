import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task55 {

	static class MyStack {

		private int maxSize;
		private int[] stackArray;
		private int top;

		public MyStack(int sizeStack) {
			maxSize = sizeStack;
			stackArray = new int[maxSize];
			top = -1;
		}

		public int help() {
			return top;
		}

		public String push(int element) {
			stackArray[++top] = element;
			return "ok";
		}

		public int pop() {
			return stackArray[top--];

		}

		public int back() {
			return stackArray[top];
		}

		public int size() {
			return top + 1;
		}

		public String clear() {
			top = -1;
			return "ok";
		}

		public String exit() {
			return "bye";
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter output = new PrintWriter(new File("output.txt"));
		MyStack s = new MyStack(10000);
		String str = "begin";
		while (!str.equals("exit")) {
			str = sc.next();
			if (str.equals("push")) {
				output.println(s.push(sc.nextInt()));
			}
			if (str.equals("pop")) {
				if (s.help() != -1)
					output.println(s.pop());
				else
					output.println("error");
			}

			if (str.equals("back"))
				if (s.help() != -1)
					output.println(s.back());
				else
					output.println("error");

			if (str.equals("size"))
				output.println(s.size());

			if (str.equals("clear"))
				output.println(s.clear());

			if (str.equals("exit")) {
				output.println(s.exit());
			}
		}
		sc.close();
		output.close();
	}
}
