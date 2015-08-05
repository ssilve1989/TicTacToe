package com.github.ssilve1989.tictactoe.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steve on 7/26/15.
 */
public class GameState {
    public static final String DRAW = "draw";

    private Board board;
    private boolean gameOver;
    private String winner;

    public GameState(Board board){
        this.board = board;
        this.winner = null;
        gameOver = checkForWin();
    }

    public boolean checkForWin() {
        if(winByColumn()){
            return true;
        }else if(winByDiagonal()){
            return true;
        }else if(winByRow()){
            return true;
        }
        if(board.getMovesLeft() == 0){
            gameOver = true;
            this.winner = DRAW;
        }
        return false;
    }

    public boolean winByRow() {
        for(String[] row : board.getBoard()){
            if(row[0].isEmpty()) return gameOver;
            if(row[0].equals(row[1]) && row[0].equals(row[2])){
                gameOver = true;
                winner = row[0];
                break;
            }
        }
        return gameOver;
    }

    public boolean winByColumn() {
        String[][] _board = board.getBoard();
        for(int i = 0; i < 3; i++){
            if(_board[0][i].equals(_board[1][i]) && _board[0][i].equals(_board[2][i])){
                if(_board[0][i].isEmpty()) return gameOver;
                gameOver = true;
                winner = _board[i][0];
                break;
            }
        }
        return gameOver;
    }

    public boolean winByDiagonal() {
        String[][] _board = board.getBoard();
        if(_board[0][0].equals(_board[1][1]) && _board[0][0].equals(_board[2][2])){
            if(_board[0][0].isEmpty()) return gameOver;
            gameOver = true;
            winner = _board[0][0];
        }
        if(_board[0][2].equals(_board[1][1]) && _board[2][0].equals(_board[0][2])){
            if(_board[0][2].isEmpty()) return gameOver;
            gameOver = true;
            winner = _board[0][0];
        }
        return gameOver;
    }

    private int score(){
        return 0;
    }

    //the minimax function
    private void getNextMove(){
        return;
    }

    public boolean isGameOver(){
        return this.gameOver;
    }

    public String getWinner(){
        return this.winner;
    }

    public Board getBoard() {
        return board;
    }
}
