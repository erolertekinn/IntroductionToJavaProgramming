package chapter07;

import java.util.Arrays;

/*
 7.16 (Execution time) Write a program that randomly generates an array of 100,000
integers and a key. Estimate the execution time of invoking the linearSearch
method in Listing 7.6. Sort the array and estimate the execution time of invoking
the binarySearch method in Listing 7.7. You can use the following code
template to obtain the execution time:
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
 */
public class Exercise07_16 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int[] randomArray = new int[1000_000];

		generateRandomArray(randomArray);
		int key = getRandomInt();
		listPrint(randomArray);
		System.out.println("\nKey :" + key);
		
		long startTime2 = System.currentTimeMillis();
		linearSearch(randomArray, key,startTime);

		
		Arrays.sort(randomArray);
		long startTime3 = System.currentTimeMillis();
		long minusLinearTime = (startTime3-startTime)-(startTime3 - startTime2);
		binarySearch(randomArray, key,minusLinearTime);

	}

	public static void listPrint(int[] randomArray) {
		int counter = 0;
		for (int i = 0; i < randomArray.length; i++) {
			System.out.print(randomArray[i] + " ");
			counter++;
			if (counter % 30 == 0)
				System.out.println();
		}
	}

	public static int getRandomInt() {
		return 1 + (int) (Math.random() * 100);
	}

	public static void generateRandomArray(int[] randomArray) {
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = getRandomInt();
		}
	}

	public static void linearSearch(int[] randomArray, int key,long startTime) {
		
		long endTime;
		long executionTime;
		int counter = 0;
		for (int i = 0; i < randomArray.length; i++) {
			if (randomArray[i] == key) {
				counter++;
				endTime = System.currentTimeMillis();
				executionTime = endTime - startTime;
				System.out.println("Key found in Random list. This process take " + executionTime);
				break;
			}

		}
		if (counter < 1) {
			endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			System.out.println("Key didnt find in Random list. This LinearSearch take " + executionTime);
		}
	}

	public static void binarySearch(int[] randomArray, int key,long minusLinearTime) {
		
		long endTime;
		long executionTime;

		int low = 0;
		int high = randomArray.length - 1;
		int counter = 0;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < randomArray[mid])
				high = mid - 1;
			else if (key == randomArray[mid]) {
				counter++;
				endTime = System.currentTimeMillis();
				executionTime = endTime - minusLinearTime;
				System.out.println("Key found in Random list. This BinarySearch take " + executionTime);
				break;
			} else
				low = mid + 1;
		}
		if (counter < 1) {
			endTime = System.currentTimeMillis();
			executionTime = endTime - minusLinearTime;
			System.out.println("Key didnt find in Random list. This BinarySearch take " + executionTime);

		}

	}

}
