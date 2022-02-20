package day6;

/*
 * import scanner class
 */
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * prime numbers can't be divided by other numbers than itself or 1
		 */
		{
			int temp;
			boolean isPrime = true;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter any number:");
			
			// capture the input in an integer
			int num = scan.nextInt();

			for (int i = 2; i < num; i++) {
				temp = num % i;
				if (temp == 0) {
					isPrime = false;
					break;
				}
			}
			// If isPrime is true then the number is prime else not
			if (isPrime)
				System.out.println(num + " is a Prime Number");
			else
				System.out.println(num + " is not a Prime Number");
			scan.close();
		}
	}

}
