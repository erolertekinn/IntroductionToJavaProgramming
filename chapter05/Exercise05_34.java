package chapter05;

import java.util.Scanner;

public class Exercise05_34 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);



		int computerWins=0,playerWins=0;
		
		while((computerWins<3 && playerWins<3)) {
			
			// B-player input 0, 1 ,2 rock paper scissor
			System.out.println("\t  ## GAME ##");
			System.out.print("scissor (0), rock(1), paper (2): ");
			int player = keyboard.nextInt();

			switch (player) {
			
			case 0:
				System.out.println("You are SCISSOR(0)");

				break;
			case 1:
				System.out.println("You are ROCK(1)");

				break;
			case 2:
				System.out.println("You are PAPER(2)");

				break;

			default:
				System.err.println("The value that you enter is not valid!");
				break;
			}

			// A-0 , 1 , 2 rock paper scissor
			int computer = (int) (Math.random() * 3);

			switch (computer) {
			case 0:
				System.out.println("Computer is SCISSOR(0)");

				break;
			case 1:
				System.out.println("Computer is ROCK(1)");

				break;
			case 2:
				System.out.println("Computer is PAPER(2)");

				break;
			}
			
			if((computer==0 && player==2)||(computer==1 && player==0)||(computer==2 && player==1)) {
				computerWins++;
				System.out.println("Computer win!");
			}
			
			
			else if((player==0 && computer==2)||(player==1 && computer==0)||(player==2 && computer==1)) {
				playerWins++;
				System.out.println("You win!");
				
			}	
			else {
				System.out.println("It is a draw");
			}
			System.out.println("Computer Score = "+computerWins);
			System.out.println("Player Score= "+playerWins);
		}
		System.out.println("GAME is Finished!\nTodays Winner is "+(computerWins>playerWins ? "Computer" : "Player"));

	}

}
