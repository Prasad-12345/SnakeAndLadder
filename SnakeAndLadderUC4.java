package assignmentday4snakeandladder;
/*
 * Author: Prasad
 * Program: Repeat till the player reaches the winning position 100
 */
public class SnakeAndLadderUC4 {

	public static void main(String[] args) {
		int position = 0;
		int maxPosition = 100;
		//To repeat till player reaches to winning position 100
		while (position <= maxPosition) {
			//to get number between 1 to 6
			int p = (int) Math.floor(Math.random() * 10) % 6 + 1;
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
		}
        System.out.println("Position :" + " " + position);
	}

}
