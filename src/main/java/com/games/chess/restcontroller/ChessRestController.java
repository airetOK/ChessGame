package com.games.chess.restcontroller;

import com.games.chess.entity.GameField;
import com.games.chess.entity.GameProcess;
import com.games.chess.facade.GameFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/chess")
public class ChessRestController {

    private GameFacade gameFacade;

    @Autowired
    public ChessRestController(GameFacade gameFacade) {
        this.gameFacade = gameFacade;
    }

    @GetMapping("/start")
    public ResponseEntity<GameField> execute() {
        // init game process here
        GameProcess gameProcess = gameFacade.startGame();
        return ResponseEntity.status(200).body(gameProcess.getGameField());

    }

    @PostMapping("/exec")
    public String execute(@RequestBody Map<String, String> body) {
        // all actions should handle here
        gameFacade.controlGameProcess(body);
        return null;
    }
}
