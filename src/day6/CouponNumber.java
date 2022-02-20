package day6;

/*
 * 
 * Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
*/
 
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		int dist = 1, count = 0;

		System.out.print("Enter the Total no of coupons Num : ");

		/*
		 * create scanner object
		 */
		Scanner num = new Scanner(System.in);

		/*
		 * prints values from user input
		 */
		int n = num.nextInt();
		int[] colt = new int[n];

		while (dist <= n) {
			int value = (int) (Math.random() * n);

			count++;

			System.out.println("Generated value " + (value + 1));
			if (colt[value] != value + 1) {
				dist++;
				colt[value] = value + 1;
			}
		}

		System.out.println("Total no of trials to get " + n + " diffrent coupon number's are " + count);
		System.out.println(" ");
		System.out.println("Array : ");

		for (int i = 0; i < n; i++) {

			System.out.println(i + " elements in the array is " + colt[i]);
			num.close();
		}

	}
}
