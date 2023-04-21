import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;


public class Task59 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter output = new PrintWriter(new File("output.txt"));
		LinkedList<Integer> queue = new LinkedList<Integer>();
		String str = "begin";
		while (!str.equals("exit")) {
			str = sc.next();
			if (str.equals("push")) {
				queue.offer(sc.nextInt());
				output.println("ok");
			}
			if (str.equals("pop")) {
				if (queue.size() != 0)
					output.println(queue.remove());
				else
					output.println("error");
			}

			if (str.equals("front"))
				if (queue.size() != 0)
					output.println(queue.element());
				else
					output.println("error");

			if (str.equals("size"))
				output.println(queue.size());

			if (str.equals("clear")) {
				queue.clear();
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
