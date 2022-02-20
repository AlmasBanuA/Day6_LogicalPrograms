package day6;

/*
 * import scanner class
 */
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int n;
		int rem = 0;
		
		//create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		
		/*
		 * printing values from user input
		 */
		n = sc.nextInt();
		while (n != 0) {
			rem = rem * 10;
			rem = rem + n % 10;
			n = n / 10;
		}
		System.out.println(rem);
		sc.close();
	}
}
