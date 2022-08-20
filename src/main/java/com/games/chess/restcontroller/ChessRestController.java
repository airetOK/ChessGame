package com.games.chess.restcontroller;

import com.games.chess.facade.GameFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/chess")
public class ChessRestController {

    private GameFacade gameFacade;

    @Autowired
    public ChessRestController(GameFacade gameFacade) {
        this.gameFacade = gameFacade;
    }

    @GetMapping("/start")
    public Map<String, String> execute() {
        // init game process here
        gameFacade.startGame();
        return null;

    }

    @PostMapping("/exec")
    public String execute(@RequestBody Map<String, String> body) {
        // all actions should handle here
        gameFacade.controlGameProcess(body);
        return null;
    }
}
