import java.util.Scanner;

public class password {
	static String Pass = "d";
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password (One lowercase letter): ");
		String attempt = sc.nextLine();
		if(checkPassword(attempt)) {
			System.out.println("Login Correct");
		}
		else if(!checkPassword(attempt)) {
			System.out.println("Login Incorrect");
		}
	}
	public static boolean checkPassword(String attempt) {
		if(attempt.equals(Pass)) {
			return true;
		}
		return false;
	}
}
