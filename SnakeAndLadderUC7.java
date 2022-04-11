package assignmentday4snakeandladder;
/*
 * Author: Prasad
 * Program: Play the game with two player and report the winner
 */
public class SnakeAndLadderUC7 {

	public static void main(String[] args) {
		int P1position = 0, P2position = 0;
		int maxPosition = 100;
		//To repeat till player reaches to winning position 100
		while(P1position <= maxPosition && P2position <= maxPosition) {
			//to get number between 1 to 6
			int p1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
			int p2 = (int) Math.floor(Math.random() * 10) % 6 + 1;
			
			//to choose options
			int option1 = (int) Math.floor(Math.random() * 10) % 3 + 1;
			int option2 = (int) Math.floor(Math.random() * 10) % 3 + 1;
			int No_Play = 1;
			int Ladder = 2;
			int Snake = 3;
			//System.out.println("option :" + " "+ option);
			//player position according to the selected option
			if (option1 == No_Play) {
				P1position = P1position;
			}
			else if (option1 == Ladder) {
				//to play again because player gets the ladder
				int p11 = (int) Math.floor(Math.random() * 10) % 6 + 1;
				P1position += p1 + p11;
			}
			else if (P1position != 0 && option1 == Snake) {
				P1position -= p1;
				if (P1position < 0) {
					P1position = 0;
				}
			}
			//to ensure player gets the exact winning position 100
			if (P1position > maxPosition) {
				int n = P1position - 100;
				P1position = P1position -n;
			}
			System.out.println("P1Position:" + P1position);
			if (P1position == 100) {
				System.out.println("Player1 won the game");
				break;
			}
			//player position according to the selected option
			if (option2 == No_Play) {
				P2position = P2position;
			}
			else if (option2 == Ladder) {
				//to play again because player gets the ladder
				int p22 = (int) Math.floor(Math.random() * 10) % 6 + 1;
				P2position += p2 + p22;
			}
			else if (P2position != 0 && option2 == Snake) {
				P2position -= p2;
				if (P2position < 0) {
					P2position = 0;
				}
			}
			//to ensure player gets the exact winning position 100
			if (P2position > 100) {
				int n = P2position - 100;
				P2position = P2position -n;
			}
			System.out.println("P2Position:" + P2position);
			if (P2position == 100) {
				System.out.println("Player2 won the game");
				break;
			}
		}

	}

}
