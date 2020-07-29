package chapter03;

import java.util.Scanner;

public class Exercise03_17 {
	public static void main(String[] args) {
		String choose1,computer1;
		//A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock
		Scanner keyboard = new Scanner(System.in);
		
		int computer = (int)(Math.random() * 3);
		
		System.out.print("scissor (0), rock (1), paper(2):");
		int choose = keyboard.nextInt();
		
		while(!(choose < 3 && choose >= 0)) {
			System.out.println("Please Enter a number between 0-2 !");
			System.out.print("scissor (0), rock (1), paper(2):");
			choose = keyboard.nextInt();	
		}
		
		if (choose == 0)
			choose1 = "scissor";
		else if (choose == 1)
			choose1 = "rock";
		else 
			choose1 = "paper";
		
		if (computer == 0)
			computer1 = "scissor";
		else if (computer == 1)
			computer1 = "rock";
		else 
			computer1 = "paper";
		
		
		
		if(choose == 0 && computer == 1 || choose == 1 && computer == 2 || choose == 2 && computer == 0 ) {
			System.out.println("The computer is "+computer1+". You are "+choose1+" and you lost.");	
		}
		else if(choose == 0 && computer == 0 || choose == 1 && computer == 1 || choose == 2 && computer == 2) {
			System.out.println("The computer is "+computer1+". You are "+choose1+" too. It is a draw");	
		}
		else {
			System.out.println("The computer is "+computer1+". You are "+choose1+". You won");
		}
			
	}

}
