package assignmentday4snakeandladder;
/*
 * Author: Prasad
 * program: Report number of times the dice was played to win the game and position after
 * every die roll
 */
public class SnakeAndLadderUC6 {

	public static void main(String[] args) {
		int position = 0, dice = 0;
		int maxPosition = 100;
		//To repeat till player reaches to winning position 100
		while (position <= maxPosition) {
			//to get number between 1 to 6
			int p = (int) Math.floor(Math.random() * 10) % 6 + 1;
			// to get number of times the dice was played
			dice = dice + 1;
		    //System.out.println("Position :" + " " + p);
			
			//to choose options
	        int option = (int) Math.floor(Math.random() * 10) % 3 +1;
			int No_Play = 1;
			int Ladder = 2;
			int Snake = 3;
			//System.out.println("option :" + " "+ option);
			//player position according to the selected option
			if (option == No_Play) {
				position = position;
			}
			else if (option == Ladder) {
				position += p;
			}
			else if (position != 0 && option == Snake) {
				position -= p;
				if (position < 0) {
					position = 0;
				}
			}
			//to ensure player gets the exact winning position 100
			if (position > maxPosition) {
				int n = position - 100;
				position = position - n;
			}
			//to get number of times the dice was played and position
			System.out.println("Dice no:"+dice +"|"+"Position" +position);
			if (position == 100) {
				break;
			}			
		}
        System.out.println("Position :" + " " + position);
	}

	}


