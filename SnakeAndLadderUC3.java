package assignmentday4snakeandladder;
/*
 * Author: Prasad
 * Program: player checks for option no play, ladder and snake
 */
public class SnakeAndLadderUC3 {

	public static void main(String[] args) {
		int position = 0;
		//to get number between 1 to 6
		int p = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Position :" + " " + p);
		
		//to choose options
        int option = (int) Math.floor(Math.random() * 10) % 3 +1;
		int No_Play = 1;
		int Ladder = 2;
		int Snake = 3;
		System.out.println("option :" + " "+ option);
		//player position according to the selected option
		if (option == No_Play) {
			position = position;
		}
		else if (option == Ladder) {
			position += p;
		}
		else if (position != 0 && option == Snake) {
			position -= p;
		}
		System.out.println("Position of player is :" + " " + position);
		
		
		
		
		
		
		
		
		
	}

}
