package interviewQuestions;

//import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String bracket = scanner.nextLine();

		Stack<Character> a = new Stack<Character>();

		int temp = 0;

		for (int i = 0; i < bracket.length(); i++) {

			if (bracket.charAt(i) == '(') {
				a.push(bracket.charAt(i));
			}
			if (bracket.charAt(i) == ')') {
				if (!a.isEmpty())
					a.pop();
				else {
					temp = 1;
				}
			}
		}
		
		if (a.isEmpty() && temp == 0) {
			System.out.println("Valid");
		} else {
			System.out.println("Not valid");
		}

		scanner.close();
	}
}
