import java.util.Scanner;

public class FactorialModified {
	public static void main(String arg[]) {
		int factorial = 1;
		System.out.println("What number would you like to find the factorial of  ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		if (number < 0) {
			System.out.println("There is no factorial for a negative number");
		} else if (number == 0) {
			factorial = 1;
			System.out.println("Factorial of number " + number + " is " + factorial);
		} else {
			for (int i = 1; i <= number; i++) {
				factorial = factorial * i;
				System.out.println("Factorial of number " + number + " is " + factorial);
			}
		}

	}
}
