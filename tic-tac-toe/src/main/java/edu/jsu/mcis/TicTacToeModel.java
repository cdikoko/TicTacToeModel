package edu.jsu.mcis;

public class TicTacToeModel {

	public enum Mark{EMPTY, O, X};
	private Mark[][] board;
	public boolean xTurn;
	public String winner;

	
	
	public TicTacToeModel
	{
		
		board = new Mark[3][3];
		for(int i= 0; i  < 3; i++)
		{
			for(int j = 0; j  < 3; j++)
			{
				board [i][j] = Mark.EMPTY 
			}
		}	
		xTurn= true;
	}
	
	public Mark getMark(int row, int col){
		return Mark.EMPTY;
	}
	
	public void setMark(int row, int col)
	{
		Mark m = (xTurn)? Mark.X:Mark.O;
		if(board[row][col]== Mark.EMPTY)	
		{
			board[row][col] = m;
			xTurn = !xTurn;
			
		}
	}
	
	public void checkWinner(){
				//top line hor
            if (board[0][0].equals(board[0][1])
                    && board[0][1].equals(board[0][2])&& board[0][0])
                winner = board[0][0];
				// middle hor
			 else if (board[1][0].equals(board[1][1])
					&& board[1][1].equals(board[1][2]))
				winner = board[0][0];
				//bottom hor
			 else if (board[2][0].equals(board[2][1])
                    && board[2][1].equals(board[2][2]))
                winner = board[2][0];
				//left vert
            else if (board[0][0].equals(board[1][0])
                    && board[1][0].equals(board[2][0]))
                winner = board[0][0];
				
				//middle vert
				
            else if (board[0][1].equals(board[1][1])
                    && board[1][1].equals(board[2][1]))
                winner = board[0][1];
				
				//right verticle
            else if (board[0][2].equals(board[1][2])
                    && board[1][2].equals(board[2][2]))
                winner = board[0][2];
				
				//diagonally from top right
			else if (board[0][2].equals(board[1][1])
                    && board[1][1].equals(board[2][0]))
                winner = board[0][2];
				//diagonally from top left
            else if (board[0][0].equals(board[1][1])
                    && board[1][1].equals(board[2][2]))
                winner = board[0][0];
			
            else winner = "TIE";
        	 
	}
	
	String getWinner(){
		return winner;
	}
	
	
	
}
