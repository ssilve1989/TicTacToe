package com.github.ssilve1989.tictactoe.test;

import com.github.ssilve1989.tictactoe.ai.AIPlayer;
import com.github.ssilve1989.tictactoe.ai.EasyAI;
import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;
import com.github.ssilve1989.tictactoe.test.helper.Boards;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steve on 7/27/15.
 */
public class EasyAITest {

    @Test
    public void randomGeneratorTest(){

    }

    @Test
    public void EasyAI(){
        final String player = "x";
        final Board board = Boards.randomBoard;
        AIPlayer ai = new EasyAI(player);
        GameState state = new GameState(board, player);
        Cell nextMove = ai.move(state);
        //assert that cell is actually available
        assertTrue(board.getCellValue(nextMove).isEmpty());
        //assert the insertion was ok
        board.placeValue(nextMove);
        assertEquals(player, board.getCellValue(nextMove));
    }
}
