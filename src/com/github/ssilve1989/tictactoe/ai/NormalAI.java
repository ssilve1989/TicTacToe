package com.github.ssilve1989.tictactoe.ai;

import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;

import java.util.List;

/**
 * Created by steve on 7/28/15.
 */
public class NormalAI extends AIPlayer {


    public NormalAI(String marker){
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
        Board board = state.getBoard();
        String[][] grid = board.getBoard();
        List<Cell> availableCells = board.getEmptyCells();
        //Should I be blocking anywehere?
        boolean block = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
        return null;
    }
}
