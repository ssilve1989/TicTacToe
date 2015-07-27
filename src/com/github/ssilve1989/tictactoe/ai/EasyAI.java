package com.github.ssilve1989.tictactoe.ai;

import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;

import java.util.List;

/**
 * Created by steve on 7/27/15.
 *
 *  This level of difficulty will randomly choose a spot to play on the board.
 */
public class EasyAI extends AIPlayer {

    private final String marker;

    public EasyAI(String marker){
        this.marker = marker;
    }

    /**
     * @param state
     * @return
     */
    @Override
    public Cell move(GameState state){
        Board board = state.getBoard();
        List<Cell> availableCells = board.getEmptyCells();
        int choice = (int) Math.round(Math.random() * availableCells.size());
        Cell cell = availableCells.get(choice);
        cell.setMarker(this.marker);
        return cell;
    }
}
