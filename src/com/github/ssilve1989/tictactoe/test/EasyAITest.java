package com.github.ssilve1989.tictactoe.test;

import com.github.ssilve1989.tictactoe.ai.AIPlayer;
import com.github.ssilve1989.tictactoe.ai.EasyAI;
import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.test.helper.Boards;
import org.junit.Test;

/**
 * Created by steve on 7/27/15.
 */
public class EasyAITest {

    @Test
    public void EasyAI(){
        final String player = "x";
        AIPlayer ai = new EasyAI(player);
        GameState state = new GameState(Boards.randomBoard, player);

    }
}
