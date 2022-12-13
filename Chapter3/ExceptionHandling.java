import java.util.*;

public class ExceptionHandling {
	
	public static int quotient(int a, int b) throws ArithmeticException {
		return a/b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Enter divded:");
				int divided = scanner.nextInt();
				System.out.print("Enter divisor:");
				int divisor = scanner.nextInt();
				System.out.println("Quotient is "+ quotient(divided, divisor));
				break;
			}
			catch (ArithmeticException e){
				System.out.println("Cannot divide by 0. Try again.");
			}
			catch (InputMismatchException e) {
				System.out.println("You must enter integers. Try again.");
				scanner.next();
			}
		}
		scanner.close();
	}
}
