package com.github.ssilve1989.tictactoe;

import java.util.Arrays;

/**
 * Created by steve on 7/26/15.
 */
public class Board {

    private static final String EMPTY = "";
    private String[][] board;
    
    public Board(){
        this.board = new String[3][3];
    }
    public Board(String[][] board){
        this.board = board;
        normalize();
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
}

