import java.util.Scanner;

public class semester1final {
	public static int factorial(int n) {
		if(n==1) {
			return n;
		}
		return n*factorial(n-1);
	} 
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find the factorial of: ");
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}
