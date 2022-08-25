package com.games.chess.facade;

import com.games.chess.entity.GameProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class GameFacade {

    private GameProcess gameProcess;

    @Autowired
    public GameFacade(GameProcess gameProcess) {
        this.gameProcess = gameProcess;
    }

    public GameProcess startGame() {
        // init game
        gameProcess.init();
        return gameProcess;
    }

    public void controlGameProcess(Map<String, String> body) {
        //parse body here
        gameProcess.updateGameField();
    }
}
