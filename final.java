import java.util.Scanner;

public class final {
	public static int factorial(int n) {
		if(n == 1) {
			return n;
		}
		return n*factorial(n-1);
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What number would you like to find the factorial of: ");
		System.out.println(factorial(3));
	}
}
