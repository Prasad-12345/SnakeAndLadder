package assignmentday4snakeandladder;
/*
 * Author: Prasad
 * Program: The player rolls the die and get nummber between 1 to  6
 */
public class SnakeAndLadderUC2 {

	public static void main(String[] args) {
		int position = 0;
		//to get number between 1 to 6
		int p = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Number after rolling dice" + " " + p);
	}
}
