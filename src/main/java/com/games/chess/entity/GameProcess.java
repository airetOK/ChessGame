package com.games.chess.entity;

import com.games.chess.strategy.GameContext;
import com.games.chess.strategy.GameStrategy;
import com.games.chess.util.ChessUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class GameProcess {

    private GameContext gameContext;
    private static Map<String, GameStrategy> strategies;
    private List<Chessman> chessmen;
    private GameField gameField;
    // private EventManager events;

    public void init() {
        List<Chessman> whiteChessmen = createChessmen(Color.WHITE);
        List<Chessman> blackChessmen = createChessmen(Color.BLACK);
        List<Position> positions = createPositions();
        settleChessmenOnPositions(whiteChessmen, blackChessmen, positions);
        this.gameField = new GameField();
        this.gameField.setCells(positions);
        this.gameField.setChessmen(Stream.concat(whiteChessmen.stream(), blackChessmen.stream())
                                                 .collect(Collectors.toList()));
    }

    public GameField updateGameField() {
        return null;
    }

    public GameField getGameField() {
        return gameField;
    }

    private List<Chessman> createChessmen(Color color) {
        List<Chessman> chessmen = new ArrayList<>();
        List<Pawn> pawns = ChessUtil.createPawns(color);
        List<Knight> knights = ChessUtil.createKnights(color);
        List<Bishop> bishops = ChessUtil.createBishops(color);
        List<Rook> rooks = ChessUtil.createRooks(color);
        Queen queen = ChessUtil.createQueen(color);
        King king = ChessUtil.createKing(color);
        chessmen.addAll(pawns);
        chessmen.addAll(knights);
        chessmen.addAll(bishops);
        chessmen.addAll(rooks);
        chessmen.add(queen);
        chessmen.add(king);
        return chessmen;
    }

    private List<Position> createPositions() {
        return ChessUtil.createPositions();
    }

    private List<Position> settleChessmenOnPositions(List<Chessman> whiteChessmen,
                                                     List<Chessman> blackChessmen,
                                                     List<Position> positions) {
        return ChessUtil.settleChessmenOnPositions(whiteChessmen, blackChessmen, positions);
    }
}
