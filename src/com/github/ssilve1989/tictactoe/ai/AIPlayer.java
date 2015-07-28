package com.github.ssilve1989.tictactoe.ai;

import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;

/**
 * Created by steve on 7/27/15.
 */
public abstract class AIPlayer {
    public static final String PLAYER_X = "x";
    public static final String PLAYER_O = "o";
    protected final String marker;

    public AIPlayer(String marker){this.marker = marker;}

    /**
     * Evaluates the given GameState to determine the next move
     * @return
     */
    public abstract Cell move(GameState state);
    public String getMarker() {return this.marker;}
}
