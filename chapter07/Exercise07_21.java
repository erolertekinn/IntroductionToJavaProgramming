package chapter07;

import java.util.Scanner;

/**************************************************************************************
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton
 * box, is a device for statistics experiments named after English scientist Sir
 * Francis Galton. It consists of an upright board with evenly spaced nails (or
 * pegs) in a triangular form, as shown in Figure 7.13.
 * 
 * Each ball takes a random path and falls into a slot.
 * 
 * Balls are dropped from the opening of the board. Every time a ball hits a
 * nail, it has a 50% chance of falling to the left or to the right. The piles
 * of balls are accumulated in the slots at the bottom of the board. Write a
 * program that simulates the bean machine. Your program should prompt the user
 * to enter the number of the balls and the number of the slots in the machine.
 * Simulate the falling of each ball by printing its path. For example, the path
 * for the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure
 * 7.13c is RLRRLRR. Display the final buildup of the balls in the slots in a
 * histogram. Here is a sample run of the program:
 * 
 * (Hint: Create an array named slots. Each element in slots stores the number
 * of balls in a slot. Each ball falls into a slot via a path. The number of Rs
 * in a path is the position of the slot where the ball falls. For example, for
 * the path LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL,
 * the ball falls into slots[2].)
 *********************************************************************************/
public class Exercise07_21 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of balls to drop :");
		int numberOfBalls = keyboard.nextInt();
		System.out.print("Enter the number of slots in the bean machine :");
		int numberOfSlots = keyboard.nextInt();

		String[] way = new String[numberOfBalls * (numberOfSlots - 1)];
		int slots[] = new int[numberOfSlots];

		beamMachine(numberOfSlots, way, slots);
		printResult(way,slots,numberOfSlots);
		

	}

	public static void printResult(String[] way, int[] slots,int numberOfSlots) {
		for (int i = 0; i < way.length; i++) {
			System.out.print(way[i]);
			if ((i+1) % (numberOfSlots - 1) == 0) {
				System.out.println();
			}
		}
		for (int i = 0; i < slots.length; i++) {
			for (int j = 1; j <= slots[i]; j++) {
				System.out.println("O");
			}
			System.out.print(" ");
		}
		
	}

	public static void beamMachine(int numberOfSlots, String[] way, int[] slots) {
		int rightCounter = 0;
		for (int i = 0; i < way.length; i++) {
			
			way[i] = randomFiller();
			

			if (way[i] == "R") {
				rightCounter++;
			}
			if ((i+1) % (numberOfSlots - 1) == 0) {
				slots[rightCounter]++;
				rightCounter=0;
			}
		}
	}

	public static String randomFiller() {
		int random = (int) (Math.random() * 2);
		if (random == 0) {
			return "L";
		} else
			return "R";
	}
}