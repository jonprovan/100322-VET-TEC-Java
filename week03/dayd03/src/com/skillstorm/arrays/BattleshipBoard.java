package com.skillstorm.arrays;

public class BattleshipBoard {
	
	public static final int ROWS = 7;
	public static final int COLS = 11;
	
	private String[][] gameBoard;
	
	public BattleshipBoard() {
		this.gameBoard = new String[ROWS][COLS];
		// ship 1
		gameBoard[0][3] = "ship";
		gameBoard[0][4] = "ship";
		// ship 2
		gameBoard[2][2] = "ship";
		gameBoard[3][2] = "ship";
		gameBoard[4][2] = "ship";
		// ship
		gameBoard[4][6] = "ship";
		gameBoard[4][7] = "ship";
		gameBoard[4][8] = "ship";
		gameBoard[4][9] = "ship";
				
	}
	
	public boolean isHit(int row, int col) throws Exception {
		if (row < 0 || row >= ROWS) 
			throw new Exception("Row must be between 0 and " + ROWS);
		if ( col < 0 || col >= COLS )
			throw new Exception("Column must be between 0 and " + COLS);
		

		boolean hit = gameBoard[row][col].equals("ship");
		if (hit) {
			gameBoard[row][col] = "hit";
		} else {
			gameBoard[row][col] = "miss";
		}
		return hit;
	}
	
	// Test
	public static void main(String[] args) {
		BattleshipBoard board = new BattleshipBoard();
		// guess
		try {
			boolean guess = board.isHit(4, 9); // hit
			System.out.println("Guess 4, 9 is a hit?" + guess);
			boolean guess1 = board.isHit(0,0); // miss
			System.out.println("Guess 0, 0 is a hit? " + guess1);
			boolean guess4 = board.isHit(10, 10); // exception
			System.out.println("Guess 10, 10 is a hit?" + guess4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
