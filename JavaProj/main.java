import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your year of birth: ");
		int birthday_year = scanner.nextInt();

		if(2026 - birthday_year  >= 18){
			System.out.println("Hello" + name);
		} else {
			System.out.println("No entry");
		}
	}
}