package com.github.ssilve1989.tictactoe.helper;

/**
 * Created by steve on 7/27/15.
 */
public class Cell {

    public static final String EMPTY = "";
    private final int row;
    private final int col;
    private final String marker;

    public Cell(int row, int col, String marker){
        this.row = row;
        this.col = col;
        this.marker = marker;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getMarker() {
        return marker;
    }
}
