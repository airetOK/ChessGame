package com.games.chess.facade;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class GameFacade {

    //uncomment the lines when GameProcess will be created
    /*private GameProcess gameProcess;

    public GameFacade(GameProcess gameProcess) {
        this.gameProcess = gameProcess;
    }*/

    public void startGame() {
        // init game
    }

    public void controlGameProcess(Map<String, String> body) {
        //parse body here
    }
}
