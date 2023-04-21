import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task60 {

	static class MyDec {

		private int maxSize;
		private int[] queArray;
		private int front;
		private int rear;
		private int nItems;

		public MyDec(int sizeDec) {
			maxSize = sizeDec;
			queArray = new int[maxSize];
			front = 100002;
			rear = 100001;
			nItems = 0;
		}

		public String push_front(int element) {
			queArray[--front] = element;
			nItems++;
			return "ok";
		}

		public String push_back(int element) {
			queArray[++rear] = element;
			nItems++;
			return "ok";
		}

		public int pop_front() {
			nItems--;
			return queArray[front++];
		}

		public int pop_back() {
			nItems--;
			return queArray[rear--];
		}

		public int front() {
			return queArray[front];
		}

		public int back() {
			return queArray[rear];
		}

		public int size() {
			return nItems;
		}

		public String clear() {
			front = 100002;
			rear = 100001;
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
		MyDec q = new MyDec(300000);
		String str = "begin";
		while (!str.equals("exit")) {
			str = sc.next();
			if (str.equals("push_front"))
				output.println(q.push_front(sc.nextInt()));

			if (str.equals("push_back"))
				output.println(q.push_back(sc.nextInt()));

			if (str.equals("pop_front"))
				output.println(q.pop_front());

			if (str.equals("pop_back"))
				output.println(q.pop_back());

			if (str.equals("front"))
				output.println(q.front());

			if (str.equals("back"))
				output.println(q.back());

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
