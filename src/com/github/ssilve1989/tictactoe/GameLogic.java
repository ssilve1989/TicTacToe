package com.github.ssilve1989.tictactoe;

import com.github.ssilve1989.tictactoe.game.GameState;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steve on 7/26/15.
 */
public class GameLogic  {

    public static int score(GameState state){
        if(state.isGameOver()){
            return state.getWinner().equals(state.getPlayer()) ? 10 : -10;
        }
        return 0;
    }

    private int minmax(GameState state){
        if(state.isGameOver()) return score(state);
        List<Integer> scores = new ArrayList<>();
        List<JSONObject> moves = new ArrayList<>();

        return 0;
    }

}
