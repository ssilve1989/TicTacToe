package com.github.ssilve1989.tictactoe.test;

import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;
import com.github.ssilve1989.tictactoe.test.helper.Boards;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steve on 7/26/15.
 */
public class BoardTest {

    @Test
    public void testNormalizeBoard(){
        String[][] _grid = Boards.randomBoard.getBoard();
        assertTrue(_grid[0][1].isEmpty());
    }

    @Test
    public void testMovesLeft(){
        final String[][] grid = new String[][] {{"x", null, "o"}, {"x", null, null}, {null, null, null}};
        Board board = new Board(grid);
        assertEquals(6, board.getMovesLeft());
    }

    @Test
    public void testRowWin(){
        GameState state = new GameState(Boards.xWinRowBoard, "x");
        assertTrue(state.winByRow());
    }

    @Test
    public void testColumnWin(){
        GameState state = new GameState(Boards.xWinColumnBoard, "x");
        assertTrue(state.winByColumn());
    }

    @Test
    public void testDiagonalWin(){
        GameState state = new GameState(Boards.xWinDiagonalBoard, "x");
        assertTrue(state.winByDiagonal());
    }

    @Test
    public void toStringTest(){
        System.out.println(Boards.xWinColumnBoard.toString());
    }

    @Test
    public void copyBoard(){
        Board copy = new Board(Boards.randomBoard);
        assertNotEquals(copy, Boards.randomBoard);
    }

    @Test
    public void modifyBoard(){
        Board board = new Board(Boards.randomBoard);
        board.getBoard()[0][0] = Cell.EMPTY;
        assertEquals(Cell.EMPTY, board.getBoard()[0][0]);
    }
}
