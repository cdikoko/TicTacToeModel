package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	

	@Test
	public void testInitialBoardIsEmpty() {
		TicTacToeModel model = new TicTacToeModel();
		for(int row = 0; row< 3; row++){
			for(int col = 0; col < 3; col++){
				TicTacToeModel.Mark m = model.getMark(row, col);
				assertEquals(TicTacToeModel.Mark.Empty, m)
			}
		}
		assertTrue(false);
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToeModel model = new TicTacToeModel();
		model.setMark(0,2);
		TicTacToeModel.Mark m = model.getMark(0,2);
		assertEquals(TicTacToeModel.Mark.X, m);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		TicTacToeModel model = new TicTacToeModel();
		model.setMark(2,0);
		TicTacToeModel.Mark m = model.getMark(2,0);
		assertEquals(TicTacToeModel.Mark.X, m);
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		TicTacToeModel model = new TicTacToeModel();
		model.setMark(1,1);
		model.setMark(1,1);
		assertTrue(model.getMark(1,1) == TicTacToeModel.Mark.X);
	}
	
	@Test
	public void testmodelIsNotOverAfterTheFirstMark() {
		TicTacToe model = new TicTacToe();
        model.makeMark(1, 1);
        model.checkWinner();
        model.getWinner();
        assertTrue(winner.equals(""))
	}
	
	@Test
	public void testmodelIsWonByXHorizontallyAcrossTopRow() {
		TicTacToeModel model = new TicTacToeModel();
        model.setMark(0, 0);
        model.setMark(2, 0);
        model.setMark(0, 1);
        model.setMark(1, 1);
        model.setMark(0, 2);
        model.checkWinner();
        winner = model.getWinner();
        assertEquals(winner, "X");
	}
	
	@Test
	public void testmodelIsOverByTieIfAllLocationsAreFilled() {
		TicTacToe model = new TicTacToe();
        model.setMark(0, 0);
        model.setMark(0, 1);
        model.setMark(1, 1);
        model.setMark(0, 2);
        model.setMark(2, 0);
        model.checkWinner();
        model.getWinner();
        model.setMark(2, 2);
        model.checkWinner();
        model.getWinner();
        model.setMark(2, 1);
        model.checkWinner();
        model.getWinner();
        model.setMark(1, 0);
        model.checkWinner();
        model.getWinner();
        model.setMark(1, 2);
        model.checkWinner();
        model.getWinner();
        winner = model.getWinner();
        assertEquals(winner, "TIE");
	}	
}
