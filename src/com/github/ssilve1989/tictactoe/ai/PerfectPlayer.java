package com.github.ssilve1989.tictactoe.ai;

import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;

import java.util.*;

/**
 * Created by steve on 7/29/15.
 */
public class PerfectPlayer extends AIPlayer{

    private Cell bestMove;

    public PerfectPlayer(String marker) {
        super(marker);
    }

    /**
     * Evaluates the given GameState to determine the next move
     *
     * @param state
     * @return
     */
    @Override
    public Cell move(GameState state) {
        minimax(state);
        bestMove.setMarker(this.marker);
        return bestMove;
    }

    /**
     * Recursively checks every possible future move and board outcome to see which can result in a win or draw. It should
     * never lose.
     * @param state - The current state of the board.
     * @return Returns a score based on the endgame state. +10 for win, 0 for draw and -10 for loss.
     */
    private int minimax(GameState state){
        if(state.isGameOver()){
            if(state.getWinner().equals(GameState.DRAW)) return 0;
            if(state.getWinner().equals(this.marker)) return 10;
            else return -10;
        }

        Board board = state.getBoard();
        List<Cell> availableCells = board.getEmptyCells();
        List<Integer> scores = new ArrayList<>();
        List<Cell> moves = new ArrayList<>();

        for(Cell cell : availableCells){
            board.placeValue(cell, this.marker);
            scores.add(minimax(new GameState(board)));
            moves.add(cell);
        }

        Collections.sort(scores);
        //min max calc
        if(this.marker.equals(PLAYER_X)){
            bestMove = moves.get(scores.size() - 1);
            return scores.get(scores.size() - 1);
        }
        else{
            bestMove = moves.get(0);
            return scores.get(0);
        }
    }
}
