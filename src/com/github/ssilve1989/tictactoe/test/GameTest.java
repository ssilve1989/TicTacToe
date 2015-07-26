package com.github.ssilve1989.tictactoe.test;

import com.github.ssilve1989.tictactoe.Board;
import com.github.ssilve1989.tictactoe.GameLogic;
import com.github.ssilve1989.tictactoe.GameState;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steve on 7/26/15.
 */
public class GameTest {

    @Test
    public void testScore(){
        String[][] xWinBoard = new String[][] {{"x", "x", "x"}, {null, null, null}, {null, null, null}};
        Board board = new Board(xWinBoard);
        GameState state = new GameState(board, "x");
        assertEquals(10, GameLogic.score(state));

        String[][] oWinBoard = new String[][] {{"o", "o", "o"}, {null, null, null}, {null, null, null}};
        Board oBoard = new Board(oWinBoard);
        GameState state2 = new GameState(oBoard, "x");
        assertEquals(-10, GameLogic.score(state2));
    }
}
