package com.github.ssilve1989.tictactoe.test;

import com.github.ssilve1989.tictactoe.Board;
import com.github.ssilve1989.tictactoe.GameState;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steve on 7/26/15.
 */
public class BoardTest {

    private static final String[][] grid = new String[][] {{"x", null, "o"}, {"x", null, null}, {null, null, null}};

    @Test
    public void testNormalizeBoard(){
        Board board = new Board(grid);
        String[][] _grid = board.getBoard();
        assertTrue(_grid[0][1].isEmpty());
    }

    @Test
    public void testMovesLeft(){
        Board board = new Board(grid);
        assertEquals(6, board.getMovesLeft());
    }

    @Test
    public void testRowWin(){
        String[][] grid = new String[][] {{"x", "x", "x"}, {null, null, null}, {null, null, null}};
        Board board = new Board(grid);
        GameState state = new GameState(board, "x");
        assertTrue(state.winByRow());
    }

    @Test
    public void testColumnWin(){
        String[][] grid = new String[][] {{"x", null, null}, {"x", null, null}, {"x", null, null}};
        Board board = new Board(grid);
        GameState state = new GameState(board, "x");
        assertTrue(state.winByColumn());
    }

    @Test
    public void testDiagonalWin(){
        String[][] grid = new String[][] {
                {"x", "o", "x"},
                {null, "x", "o"},
                {null, "o", "x"}
        };
        Board board = new Board(grid);
        GameState state = new GameState(board, "x");
        assertTrue(state.winByDiagonal());
    }
}
