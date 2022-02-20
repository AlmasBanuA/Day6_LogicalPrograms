package day6;

/*
 * import scanner class
 */
import java.util.Scanner;

class StopWatchProgram {
	public static void main(String[] args) {
		
		// create scanner object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 to start clock");
		
		/*
		 * gives the start time and prints it
		 */
		double start = sc.nextDouble();
		start = System.currentTimeMillis();

		System.out.println("Enter 0 to stop clock");
		
		/*
		 * stop the timer and prints it
		 */
		double stop = sc.nextDouble();
		stop = System.currentTimeMillis();
		
		/*
		 * between start time and stop time elapsed time will print
		 */
		double elapsed_time = (stop - start) / 1000;
		System.out.println("Elapsed time is " + elapsed_time);
		sc.close();
	}
}
