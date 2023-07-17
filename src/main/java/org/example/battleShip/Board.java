package org.example.battleShip;


public class Board {
    private static final Ship[] ships;
    private char[][] board;

    static {
        ships = new Ship[]{
                new Ship("Четырехпалубник", Constants.DECK4_SIZE),
                new Ship("Трехпалубник", Constants.DECK3_SIZE),
                new Ship("Двухпалубник", Constants.DECK2_SIZE),
                new Ship("Однопалубник", Constants.DECK1_SIZE)
        };
    }

    public Board() {
        board = new char[Constants.SIDE_SIZE_BOARD][Constants.SIDE_SIZE_BOARD];

        for(int i = 0; i < Constants.SIDE_SIZE_BOARD; i++) {
            for(int j = 0; j < Constants.SIDE_SIZE_BOARD; j++) {
                board[i][j] = Constants.BOARD_EMPTY;
            }
        }

        shipsOnBoard();
    }
    private void shipsOnBoard() {

    }
}
