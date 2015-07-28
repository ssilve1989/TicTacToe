package com.github.ssilve1989.tictactoe.test.helper;

import com.github.ssilve1989.tictactoe.game.Board;

/**
 * Created by steve on 7/27/15.
 */
public class Boards {

    private static final String[][] randomGrid = new String[][] {
            {"x", null, "o"},
            {"x", null, null},
            {null, null, null}
    };

    private static final String[][] xWinRow = new String[][]{
            {"x", "x", "x"},
            {null, null, null},
            {null, null, null}
    };

    private static final String[][]  xWinColumn = new String[][]{
            {"x", null, null},
            {"x", null, null},
            {"x", null, null}
    };
    private static final String[][] xWinDiagonal = new String[][] {
            {"x", "o", "x"},
            {null, "x", "o"},
            {null, "o", "x"}
    };

    private static final String[][] lastColumnWin = new String[][] {
            {"", "o", "x"},
            {"x", "", "x"},
            {"o", "o", "x"}
    };

    public static final Board randomBoard = new Board(randomGrid);
    public static final Board xWinRowBoard = new Board(xWinRow);
    public static final Board xWinColumnBoard = new Board(xWinColumn);
    public static final Board xWinDiagonalBoard = new Board(xWinDiagonal);
    public static final Board lastColumnWinBoard = new Board(lastColumnWin);
}
