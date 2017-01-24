import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	
	public void startNewGame() {
		TicTacToeModel model= new TicTacToeModel();
	}
	
	public void markLocation(int row, int col) {
		return model.setMark(row, col);
	}
	
	public String getMark(int row, int col) {
		return model.getMark(row, col);
	}
    
	public String getWinner() {
		return model.getWinner();
	}
}
