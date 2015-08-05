package com.github.ssilve1989.tictactoe;

import com.github.ssilve1989.tictactoe.ai.AIPlayer;
import com.github.ssilve1989.tictactoe.ai.EasyAI;
import com.github.ssilve1989.tictactoe.game.Board;
import com.github.ssilve1989.tictactoe.game.GameState;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steve on 7/26/15.
 */
public class TicTacToe {

    /*
    public static int score(GameState state){
        if(state.isGameOver()){
            return state.getWinner().equals(state.getPlayer()) ? 10 : -10;
        }
        return 0;
    }
    */

    public void play(){
        Board board = new Board(); //empty board
        AIPlayer playerOne = new EasyAI(AIPlayer.PLAYER_X);
        AIPlayer playerTwo = new EasyAI(AIPlayer.PLAYER_O);
        GameState state = new GameState(board); //the initial state of the game
    }

}
