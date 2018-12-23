import java.util.Random;

/*
 * This program takes an argument for a specific number of integers
 * to be randomly generated and printed on the screen. Then, the number
 * of even numbers are presented, as well as the average number.
 */
public class RandomNumbers {
	
	public static final int MAX=1000;
	public static final int MIN=1;

	public static void main(String[] args) {		

		int number = 0;
		if(args.length <= 0) 
			System.exit(0);
		
		number = Integer.parseInt(args[0]);
		getRandomArray(number);
		
		int[] random = getRandomArray(number);
		
		printArray(random);
		
		int even= 0;
		for (int i = 0; i < random.length; i++) {
			if(isEven(random[i]))
				even++;		
		}
		
		double averageNumber = getAverage(random);
		
		System.out.println("Evens: " + even + " Avg: " + averageNumber);
	}
	
	// Uses the argument to generate a random array within 
	// the minimum and maximum values.
	public static int[] getRandomArray(int number) {
		int[] random = new int[number];
		Random rand = new Random();
		
		for (int i = 0; i < number; i++) {
			random[i]=rand.nextInt(MAX-MIN+1)+7;
		}
		
		return random;
	}
	
	// Prints out the contents of an array.
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	// Takes in an array and computes the average.
	public static double getAverage(int[] array) {
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		double average = sum / array.length;
		
		return average;
	}
	
	// Takes in a number and determines if it is even.
	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		
		return false;
	}
}