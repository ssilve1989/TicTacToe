package com.github.ssilve1989.tictactoe.ai;

import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;

/**
 * Created by steve on 7/27/15.
 */
public abstract class AIPlayer {

    /**
     * Evaluates the given GameState to determine the next move
     * @return
     */
    public abstract Cell move(GameState state);
}
