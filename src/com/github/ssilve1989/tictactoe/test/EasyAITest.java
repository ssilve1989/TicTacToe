package com.github.ssilve1989.tictactoe.test;

import com.github.ssilve1989.tictactoe.ai.AIPlayer;
import com.github.ssilve1989.tictactoe.ai.EasyAI;
import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import com.github.ssilve1989.tictactoe.helper.Cell;
import com.github.ssilve1989.tictactoe.test.helper.Boards;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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

    @Test
    public void testMoves(){
        Board board = new Board();
        AIPlayer easy = new EasyAI(AIPlayer.PLAYER_X);
        GameState state = new GameState(board, easy.getMarker());
        for(int i = 0; i < 100; i++){
            Cell move = easy.move(state);
            assertTrue(move.getRow() < 3);
            assertTrue(move.getCol() < 3);
        }
    }

    @Test
    public void simulateGame(){
        Board board = new Board();
        EasyAI playerOne = new EasyAI(AIPlayer.PLAYER_X); //simulate human player
        EasyAI playerTwo = new EasyAI(AIPlayer.PLAYER_O);
        GameState state = new GameState(board, AIPlayer.PLAYER_X);
        boolean xMoves = true;
        while(!state.isGameOver()){
            //who goes!
            Cell nextMove = null;
            if(xMoves){
                nextMove = playerOne.move(state);
                xMoves = false;
            }else{
                nextMove = playerTwo.move(state);
                xMoves = true;
            }
            board.placeValue(nextMove);
            state = new GameState(board, AIPlayer.PLAYER_X);
        }
        assertTrue(state.isGameOver());
    }
}
