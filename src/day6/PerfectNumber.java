package day6;

/*
 * importing scanner class
 */
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int n; //initialize a number(n)
		
		/*
		 * declaring variable for storing sum
		 */
		int sum = 0;
		
		/*
		 * create scanner object
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		n = sc.nextInt();	//print values from user input
		
		/*
		 *Finding the factors of the given number (n) by using for loop
		 */
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
				System.out.println(sum);
			}
		}
		
		/*
		 * compare the sum with the number
		 * if both are equal they are perfect number
		 * else not perfect
		 */
		if (sum == n) {
			System.out.println("enter no is perfect ");
		} else
			System.out.println("Enter no is not perfect");
		sc.close();
	}
}
