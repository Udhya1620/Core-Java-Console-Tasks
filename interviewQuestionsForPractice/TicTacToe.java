package interviewQuestionsForPractice;

import java.util.Scanner;

public class TicTacToe {

	static char board[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	
	static char player = 'X';
	
	public static void main(String[] args) {
		
      Scanner scanner = new Scanner(System.in);
      
      boolean gameFinished = false;
      
      while(!gameFinished) {
    	  
    	  showBoard();
    	  
    	  System.out.println("player "+player+ " choose a position (1-9) : ");
    	  
    	  int position = scanner.nextInt();
    	  
    	  if(addPosition(position)) {
    		  if(checkWin()) {
    			  showBoard();
    			  System.out.println(player+" has won the game");
    			  gameFinished = true;
    		  }
    		  else if(checkDraw()) {
    			  showBoard();
    			  System.out.println("the game is a draw");
    			  gameFinished = true;
    		  }else {
    			  player = player == 'X' ? 'O' : 'X';
    		  }
    	  }
    	  
     }
      scanner.close();
	}

	private static boolean checkDraw() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(board[i][j] != 'X' && board[i][j] !='O') {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkWin() {
		 for(int i= 0; i<3; i++) {
			 if(board[i][0] == player && board[i][1] == player && board[i][2] == player ) {
				return true;
			 }
			 if(board[0][i] == player && board[1][i] == player && board[2][i] == player ) {
				 return true;
			 }
		 }
		 if(board[0][0] == player && board[1][1] == player && board[2][2] == player ) {
			 return true;
		 }
		 if(board[0][2] == player && board[1][1] == player && board[2][0] == player ) {
			 return true;
		 }
		return false;
	}

	private static boolean addPosition(int position) {
		for(int i =0; i<3; i++) {
			for(int j = 0 ; j<3; j++) {
				if(board[i][j] == (char)( position +'0')) {
					board[i][j] = player;
					return true;
				}
			}
		}
		return false;
	}

	private static void showBoard() {
		
		for(int i= 0; i<3; i++) {
			System.out.println(" "+board[i][0]+" | "+board[i][1]+" | "+ board[i][2]);
			if(i<2) {
				System.out.println("---+---+---");
			}
			
		}
		
	}

}
