package com.github.ssilve1989.tictactoe.game;

import com.github.ssilve1989.tictactoe.helper.Cell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by steve on 7/26/15.
 */
public class Board {

    private static final String EMPTY = Cell.EMPTY;
    private String[][] board;

    public Board(){
        this.board = new String[3][3];
    }
    public Board(String[][] board){
        this.board = board;
        normalize();
    }

    public Board(Board board) {
        this.board = board.getBoard().clone();
    }

    /**
     *
     * @return
     */
    private void normalize(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == null) board[i][j] = EMPTY;
            }
        }
    }

    public String[][] getBoard(){return this.board;}

    /**
     * Returns how many empty spaces are on the board
     * @return
     */
    public int getMovesLeft(){
        int count = 0;
        for(String[] row : board){
            for(String cell : row){
                if(cell.equals(EMPTY)) count++;
            }
        }
        return count;
    }

    public List<Cell> getEmptyCells(){
        List<Cell> emptyCells = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j].equals(EMPTY)){
                    emptyCells.add(new Cell(i, j, EMPTY));
                }
            }
        }
        return emptyCells.isEmpty() ? Collections.emptyList() : emptyCells;
    }

    public String getCellValue(Cell cell) {
        return board[cell.getRow()][cell.getCol()];
    }

    public boolean equals(Board _board){
        String[][] otherBoard = _board.getBoard();
        boolean equals = false;
        for(int i = 0; i < 3; i++){
            if(Arrays.equals(this.board[i], otherBoard[i])){
                equals = true;
            }
        }
        return equals;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(String[] row : board){
            for(String cell : row){
                s.append("\'").append(cell).append("\' ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public void placeValue(Cell nextMove) {
        //gracefully handle attempting to fill a non-empty cell
        if(!board[nextMove.getRow()][nextMove.getCol()].isEmpty()) return;
        board[nextMove.getRow()][nextMove.getCol()] = nextMove.getMarker();
    }
}

