package day6;

/*
 * importing scanner class
 */
import java.util.Scanner;

/*
 * In Fibonacci series, next number is the sum of previous two numbers
 * first two numbers of fibonacci series are 0 and 1.
 */
public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		int n;
		
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of n:");
		
		/*
		 * taking values from input
		 */
		n = sc.nextInt();
		
		/*
		 * printing zero and one
		 */
		System.out.println(a + " " + b);
		for (int i = 1; i <= n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			sc.close();
		}
	}
}

	


