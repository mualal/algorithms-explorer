import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;


public class Task62 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter output = new PrintWriter(new File("output.txt"));
		LinkedList<Integer> dec = new LinkedList<Integer>();
		String str = "begin";
		while (!str.equals("exit")) {
			str = sc.next();
			if (str.equals("push_front")) {
				dec.addFirst(sc.nextInt());
				output.println("ok");
			}
			if (str.equals("push_back")) {
				dec.addLast(sc.nextInt());
				output.println("ok");
			}
			if (str.equals("pop_front")) {
				if (dec.size() != 0)
					output.println(dec.removeFirst());
				else
					output.println("error");
			}
			if (str.equals("pop_back")) {
				if (dec.size() != 0)
					output.println(dec.removeLast());
				else
					output.println("error");
			}

			if (str.equals("front"))
				if (dec.size() != 0)
					output.println(dec.getFirst());
				else
					output.println("error");

			if (str.equals("back"))
				if (dec.size() != 0)
					output.println(dec.getLast());
				else
					output.println("error");

			if (str.equals("size"))
				output.println(dec.size());

			if (str.equals("clear")) {
				dec.clear();
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
