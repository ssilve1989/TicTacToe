package com.github.ssilve1989.tictactoe;

/**
 * Created by steve on 7/26/15.
 */
public class GameState {
    private static final String DRAW = "draw";

    private Board board;
    private final String player;
    private final String opponent;
    private boolean gameOver;
    private String winner;

    public GameState(Board board, String player){
        this.board = board;
        this.player = player.toLowerCase();
        this.opponent = player.equals("x") ? "o" : "x";
        this.winner = null;
        gameOver = checkForWin();
    }

    private boolean checkForWin() {
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
            gameOver = true;
            winner = _board[0][0];
            return gameOver;
        }
        if(_board[0][2].equals(_board[1][1]) && _board[2][0].equals(_board[0][2])){
            gameOver = true;
            winner = _board[0][0];
            return gameOver;
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


    public String getOpponent() {
        return this.opponent;
    }

    public String getPlayer() {
        return this.player;
    }
}
