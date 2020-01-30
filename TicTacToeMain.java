import java.util.Scanner;

public class TicTacToeMain {

	  public static void main (String[] args)
	  {
		  String yes = "yes";
		  String no = "no";
		  String secondAnswer = null;
		  String no2 = "ye";
		  char [][]board = new char[3][3];
	      Scanner scanner = new Scanner(System.in);
	      
	     System.out.print("Do you want to play: yes or no?");

	    // get their input as a String
	    String playAnswer = scanner.next();
	    
	    //if playerAnswer is equal to yes
	    if (playAnswer.equals(yes)) {
	    	printBoard(board);
	    }
	    
	    else if (playAnswer.equals(no)){
	    	System.out.print("Are you sure you don't want to play?");
	    	secondAnswer = scanner.next();
	    	
	        if (secondAnswer.equals(no2)) {
	        	System.out.println("See ya later!");
	        }
	    }  
	}
	  
	  //Print board to console 
	  public static void printBoard(char[][] board) {
	      for (int i = 0; i < board.length; i++) {
	          for (int j = 0; j < board[i].length; j++) {
	              System.out.print("[ " + board[i][j] + " ]");
	          }
	          System.out.println();
	          }
	  }	
}







