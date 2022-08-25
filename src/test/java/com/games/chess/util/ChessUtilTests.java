package com.games.chess.util;

import com.games.chess.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ChessApplicationTests {

    @Test
    void testCreatePawns() {
        List<Pawn> whitePawns = ChessUtil.createPawns(Color.WHITE);
        List<Pawn> blackPawns = ChessUtil.createPawns(Color.BLACK);
        assertEquals(16, whitePawns.size() + blackPawns.size());
        assertEquals("PWA2", whitePawns.get(0).getId());
        assertEquals("PWD2", whitePawns.get(3).getId());
        assertEquals("PWH2", whitePawns.get(7).getId());
        assertEquals("PBA7", blackPawns.get(0).getId());
        assertEquals("PBD7", blackPawns.get(3).getId());
        assertEquals("PBH7", blackPawns.get(7).getId());

        assertEquals("A2", whitePawns.get(0).getCurrentPosition().getName());
        assertEquals("D2", whitePawns.get(3).getCurrentPosition().getName());
        assertEquals("H2", whitePawns.get(7).getCurrentPosition().getName());
        assertEquals("A7", blackPawns.get(0).getCurrentPosition().getName());
        assertEquals("D7", blackPawns.get(3).getCurrentPosition().getName());
        assertEquals("H7", blackPawns.get(7).getCurrentPosition().getName());

        assertEquals(true, whitePawns.get(0).getAlive());
        assertEquals(true, blackPawns.get(0).getAlive());
    }

    @Test
    void testCreateKnights() {
        List<Knight> whiteKnights = ChessUtil.createKnights(Color.WHITE);
        List<Knight> blackKnights = ChessUtil.createKnights(Color.BLACK);
        assertEquals(4, whiteKnights.size() + blackKnights.size());
        assertEquals("HWB1", whiteKnights.get(0).getId());
        assertEquals("HWG1", whiteKnights.get(1).getId());
        assertEquals("HBB8", blackKnights.get(0).getId());
        assertEquals("HBG8", blackKnights.get(1).getId());

        assertEquals("B1", whiteKnights.get(0).getCurrentPosition().getName());
        assertEquals("G1", whiteKnights.get(1).getCurrentPosition().getName());
        assertEquals("B8", blackKnights.get(0).getCurrentPosition().getName());
        assertEquals("G8", blackKnights.get(1).getCurrentPosition().getName());

        assertEquals(true, whiteKnights.get(0).getAlive());
        assertEquals(true, blackKnights.get(0).getAlive());
    }

    @Test
    void testCreateBishops() {
        List<Bishop> whiteBishops = ChessUtil.createBishops(Color.WHITE);
        List<Bishop> blackBishops = ChessUtil.createBishops(Color.BLACK);
        assertEquals(4, whiteBishops.size() + blackBishops.size());
        assertEquals("BWC1", whiteBishops.get(0).getId());
        assertEquals("BWF1", whiteBishops.get(1).getId());
        assertEquals("BBC8", blackBishops.get(0).getId());
        assertEquals("BBF8", blackBishops.get(1).getId());

        assertEquals("C1", whiteBishops.get(0).getCurrentPosition().getName());
        assertEquals("F1", whiteBishops.get(1).getCurrentPosition().getName());
        assertEquals("C8", blackBishops.get(0).getCurrentPosition().getName());
        assertEquals("F8", blackBishops.get(1).getCurrentPosition().getName());

        assertEquals(true, whiteBishops.get(0).getAlive());
        assertEquals(true, blackBishops.get(0).getAlive());
    }

    @Test
    void testCreateRooks() {
        List<Rook> whiteRooks = ChessUtil.createRooks(Color.WHITE);
        List<Rook> blackRooks = ChessUtil.createRooks(Color.BLACK);
        assertEquals(4, whiteRooks.size() + blackRooks.size());
        assertEquals("RWA1", whiteRooks.get(0).getId());
        assertEquals("RWH1", whiteRooks.get(1).getId());
        assertEquals("RBA8", blackRooks.get(0).getId());
        assertEquals("RBH8", blackRooks.get(1).getId());

        assertEquals("A1", whiteRooks.get(0).getCurrentPosition().getName());
        assertEquals("H1", whiteRooks.get(1).getCurrentPosition().getName());
        assertEquals("A8", blackRooks.get(0).getCurrentPosition().getName());
        assertEquals("H8", blackRooks.get(1).getCurrentPosition().getName());

        assertEquals(true, whiteRooks.get(0).getAlive());
        assertEquals(true, blackRooks.get(0).getAlive());
    }

    @Test
    void testCreateQueens() {
        Queen whiteQueen = ChessUtil.createQueen(Color.WHITE);
        Queen blackQueen = ChessUtil.createQueen(Color.BLACK);
        assertEquals("QWD1", whiteQueen.getId());
        assertEquals("QBD8", blackQueen.getId());

        assertEquals("D1", whiteQueen.getCurrentPosition().getName());
        assertEquals("D8", blackQueen.getCurrentPosition().getName());

        assertEquals(true, whiteQueen.getAlive());
        assertEquals(true, blackQueen.getAlive());
    }

    @Test
    void testCreateKings() {
        King whiteKing = ChessUtil.createKing(Color.WHITE);
        King blackKing = ChessUtil.createKing(Color.BLACK);
        assertEquals("KWE1", whiteKing.getId());
        assertEquals("KBE8", blackKing.getId());

        assertEquals("E1", whiteKing.getCurrentPosition().getName());
        assertEquals("E8", blackKing.getCurrentPosition().getName());

        assertEquals(true, whiteKing.getAlive());
        assertEquals(true, blackKing.getAlive());
    }

    @Test
    void testCreatePositions() {
        List<Position> positions = ChessUtil.createPositions();
        assertEquals(64, positions.size());
        assertEquals("A1", positions.get(0).getName());
        assertEquals("H8", positions.get(63).getName());
        assertEquals("C4", positions.get(26).getName());
        assertEquals("D8", positions.get(59).getName());
        assertTrue(positions.get(4).getKingThere());
        assertTrue(positions.get(60).getKingThere());
        assertFalse(positions.get(56).getKingThere());
        assertFalse(positions.get(13).getKingThere());
        assertFalse(positions.get(15).getEmpty());
        assertTrue(positions.get(16).getEmpty());
        assertTrue(positions.get(33).getEmpty());
    }

    @Test
    void testSettleChessmenOnPositions() {
        List<Chessman> whiteChessmen = new ArrayList<>();
        whiteChessmen.addAll(ChessUtil.createPawns(Color.WHITE));
        whiteChessmen.addAll(ChessUtil.createKnights(Color.WHITE));
        whiteChessmen.addAll(ChessUtil.createBishops(Color.WHITE));
        whiteChessmen.addAll(ChessUtil.createRooks(Color.WHITE));
        whiteChessmen.add(ChessUtil.createQueen(Color.WHITE));
        whiteChessmen.add(ChessUtil.createKing(Color.WHITE));
        List<Chessman> blackChessmen = new ArrayList<>();
        blackChessmen.addAll(ChessUtil.createPawns(Color.BLACK));
        blackChessmen.addAll(ChessUtil.createKnights(Color.BLACK));
        blackChessmen.addAll(ChessUtil.createBishops(Color.BLACK));
        blackChessmen.addAll(ChessUtil.createRooks(Color.BLACK));
        blackChessmen.add(ChessUtil.createQueen(Color.BLACK));
        blackChessmen.add(ChessUtil.createKing(Color.BLACK));
        List<Position> positions = ChessUtil.createPositions();
        ChessUtil.settleChessmenOnPositions(whiteChessmen, blackChessmen, positions);

        assertEquals("RWA1", positions.stream()
                .filter(pos -> pos.getName().equals("A1"))
                .findFirst()
                .get()
                .getChessman()
                .getId());

        assertEquals("KWE1", positions.stream()
                .filter(pos -> pos.getName().equals("E1"))
                .findFirst()
                .get()
                .getChessman()
                .getId());

        assertEquals("BWF1", positions.stream()
                .filter(pos -> pos.getName().equals("F1"))
                .findFirst()
                .get()
                .getChessman()
                .getId());

        assertEquals("BBC8", positions.stream()
                .filter(pos -> pos.getName().equals("C8"))
                .findFirst()
                .get()
                .getChessman()
                .getId());

        assertEquals("KBE8", positions.stream()
                .filter(pos -> pos.getName().equals("E8"))
                .findFirst()
                .get()
                .getChessman()
                .getId());

        assertEquals("RBH8", positions.stream()
                .filter(pos -> pos.getName().equals("H8"))
                .findFirst()
                .get()
                .getChessman()
                .getId());

        assertTrue(positions.stream()
                .filter(pos -> pos.getName().equals("D4"))
                .findFirst()
                .get()
                .getEmpty());

        assertTrue(positions.stream()
                .filter(pos -> pos.getName().equals("E8"))
                .findFirst()
                .get()
                .getKingThere());
    }

}
