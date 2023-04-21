import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task58 {

	static class MyQueue {

		private int maxSize;
		private int[] queArray;
		private int front;
		private int rear;
		private int nItems;

		public MyQueue(int sizeQueue) {
			maxSize = sizeQueue;
			queArray = new int[maxSize];
			front = 0;
			rear = -1;
			nItems = 0;
		}

		public String push(int element) {
			if (rear == maxSize - 1)
				rear = -1;
			queArray[++rear] = element;
			nItems++;
			return "ok";
		}

		public int pop() {
			int temp = queArray[front++];
			if (front == maxSize) {
				front = 0;
				rear = -1;
			}
			nItems--;
			return temp;
		}

		public int front() {
			return queArray[front];
		}

		public int size() {
			return nItems;
		}

		public String clear() {
			front = 0;
			rear = -1;
			nItems = 0;
			return "ok";
		}

		public String exit() {
			return "bye";
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter output = new PrintWriter(new File("output.txt"));
		MyQueue q = new MyQueue(30000);
		String str = "begin";
		while (!str.equals("exit")) {
			str = sc.next();
			if (str.equals("push"))
				output.println(q.push(sc.nextInt()));

			if (str.equals("pop")) {
				if (q.size() != 0)
					output.println(q.pop());
				else
					output.println("error");
			}

			if (str.equals("front"))
				if (q.size() != 0)
					output.println(q.front());
				else
					output.println("error");

			if (str.equals("size"))
				output.println(q.size());

			if (str.equals("clear"))
				output.println(q.clear());

			if (str.equals("exit")) {
				output.println(q.exit());
			}
		}
		sc.close();
		output.close();
	}
}
