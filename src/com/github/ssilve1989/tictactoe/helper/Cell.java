package com.github.ssilve1989.tictactoe.helper;

/**
 * Created by steve on 7/27/15.
 */
public class Cell {

    public static final String EMPTY = "";
    private final int row;
    private final int col;
    private String marker;

    public Cell(int row, int col, String marker){
        this.row = row;
        this.col = col;
        this.marker = marker == null ? EMPTY : marker;
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

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append('[').append(row).append("][").append(col).append("] = ").append(marker.isEmpty() ? "EMPTY" : marker);
        return s.toString();
    }
}
