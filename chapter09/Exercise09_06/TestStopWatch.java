package chapter09.Exercise09_06;

public class TestStopWatch {
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();

		int[] randomArray = new int[100_000];

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * randomArray.length);
		}

		stopWatch.start();

		selectionSort(randomArray);

		stopWatch.stop();

		System.out.println("The sort time: " + stopWatch.getElapsedTime() + " milliseconds");

	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}
}