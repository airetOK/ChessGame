package com.games.chess.util;

import com.games.chess.entity.*;

import java.util.*;

/**
 * Util class for creating chess figures.
 * Pattern for figure's id is: first char of figure + color + cell's position (uppercase)
 * e.g. 'KWC5' it means 'White king is on position C5'.
 * except: as the King and the Knight have the same first letter, then for the Knight should be used 'H' char.
 * **/
public class ChessUtil {

    private static final String CHESS_LITERALS = "ABCDEFGH";
    private static final String CHESS_DIGITS = "12345678";
    private static final List<String> whiteStartPos = new ArrayList<>();
    private static final List<String> blackStartPos = new ArrayList<>();
    private static StringBuilder stringBuilder = new StringBuilder();

    static {
        for (int i = 0; i < 8; i++) {
            whiteStartPos.add(CHESS_LITERALS.charAt(i) + "1");
            whiteStartPos.add(CHESS_LITERALS.charAt(i) + "2");
            blackStartPos.add(CHESS_LITERALS.charAt(i) + "7");
            blackStartPos.add(CHESS_LITERALS.charAt(i) + "8");
        }
    }

    public static List<Pawn> createPawns(Color color) {
        List<Pawn> pawns = new LinkedList<>();
        Pawn pawn;
        for (int i = 0; i < 8; i++) {
            if (color.equals(Color.WHITE)) {
                String whitePos = stringBuilder.append(CHESS_LITERALS.charAt(i)).append("2").toString();
                stringBuilder.setLength(0);
                pawn = new Pawn(String.format("%s%s", "PW", whitePos), Color.WHITE, true);
            } else {
                String blackPos = stringBuilder.append(CHESS_LITERALS.charAt(i)).append("7").toString();
                stringBuilder.setLength(0);
                pawn = new Pawn(String.format("%s%s", "PB", blackPos), Color.BLACK, true);
            }
            pawns.add(pawn);
        }
        return pawns;
    }

    public static List<Knight> createKnights(Color color) {
        final String LITERALS = "BG";
        List<Knight> knights = new LinkedList<>();
        Knight knight;
        for (int i = 0; i < 2; i++) {
            if (color.equals(Color.WHITE)) {
                String whitePos = stringBuilder.append(LITERALS.charAt(i)).append("1").toString();
                stringBuilder.setLength(0);
                knight = new Knight(String.format("%s%s", "HW", whitePos), Color.WHITE, true);
            } else {
                String blackPos = stringBuilder.append(LITERALS.charAt(i)).append("8").toString();
                stringBuilder.setLength(0);
                knight = new Knight(String.format("%s%s", "HB", blackPos), Color.BLACK, true);
            }
            knights.add(knight);
        }
        return knights;
    }

    public static List<Bishop> createBishops(Color color) {
        final String LITERALS = "CF";
        List<Bishop> bishops = new LinkedList<>();
        Bishop bishop;
        for (int i = 0; i < 2; i++) {
            if (color.equals(Color.WHITE)) {
                String whitePos = stringBuilder.append(LITERALS.charAt(i)).append("1").toString();
                stringBuilder.setLength(0);
                bishop = new Bishop(String.format("%s%s", "BW", whitePos), Color.WHITE, true);
            } else {
                String blackPos = stringBuilder.append(LITERALS.charAt(i)).append("8").toString();
                stringBuilder.setLength(0);
                bishop = new Bishop(String.format("%s%s", "BB", blackPos), Color.BLACK, true);
            }
            bishops.add(bishop);
        }
        return bishops;
    }

    public static List<Rook> createRooks(Color color) {
        final String LITERALS = "AH";
        List<Rook> rooks = new LinkedList<>();
        Rook rook;
        for (int i = 0; i < 2; i++) {
            if (color.equals(Color.WHITE)) {
                String whitePos = stringBuilder.append(LITERALS.charAt(i)).append("1").toString();
                stringBuilder.setLength(0);
                rook = new Rook(String.format("%s%s", "RW", whitePos), Color.WHITE, true);
            } else {
                String blackPos = stringBuilder.append(LITERALS.charAt(i)).append("8").toString();
                stringBuilder.setLength(0);
                rook = new Rook(String.format("%s%s", "RB", blackPos), Color.BLACK, true);
            }
            rooks.add(rook);
        }
        return rooks;
    }

    public static Queen createQueen(Color color) {
        Queen queen;
        if (color.equals(Color.WHITE)) {
            String whitePos = stringBuilder.append("D").append("1").toString();
            stringBuilder.setLength(0);
            queen = new Queen(String.format("%s%s", "QW", whitePos), Color.WHITE, true);
        } else {
            String blackPos = stringBuilder.append("D").append("8").toString();
            stringBuilder.setLength(0);
            queen = new Queen(String.format("%s%s", "QB", blackPos), Color.BLACK, true);
        }
        return queen;
    }

    public static King createKing(Color color) {
        King king;
        if (color.equals(Color.WHITE)) {
            String whitePos = stringBuilder.append("E").append("1").toString();
            stringBuilder.setLength(0);
            king = new King(String.format("%s%s", "KW", whitePos), Color.WHITE, true);
        } else {
            String blackPos = stringBuilder.append("E").append("8").toString();
            stringBuilder.setLength(0);
            king = new King(String.format("%s%s", "KB", blackPos), Color.BLACK, true);
        }
        return king;
    }

    public static List<Position> createPositions() {
        List<Position> positions = new LinkedList<>();
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                String posName = CHESS_LITERALS.charAt(j) + "" +  CHESS_DIGITS.charAt(i);
                Position position;
                if (posName.matches(".*[3456]")) {
                    position = new Position(posName, true, false);
                } else {
                    if (posName.equals("E1") || posName.equals("E8")) {
                        position = new Position(posName, false, true);
                    } else {
                        position = new Position(posName, false, false);
                    }
                }
                positions.add(position);
            }

        }
        return positions;
    }

    public static List<Position> settleChessmenOnPositions(List<Chessman> whiteChessmen,
                                                           List<Chessman> blackChessmen,
                                                           List<Position> positions) {
            for (String startPos : whiteStartPos) {
                Position position = findPositionByName(startPos, positions);
                Chessman chessman = findChessmanById(startPos, whiteChessmen);
                position.setChessman(chessman);
            }
            for (String startPos : blackStartPos) {
                Position position = findPositionByName(startPos, positions);
                Chessman chessman = findChessmanById(startPos, blackChessmen);
                position.setChessman(chessman);
            }
        return positions;
    }

    private static Position findPositionByName(String name, List<Position> positions) {
        return positions.stream().filter(position -> position.getName().equals(name)).findFirst().get();
    }

    private static Chessman findChessmanById(String id, List<Chessman> chessmen) {
        return chessmen.stream().filter(chessman -> chessman.getId().contains(id)).findFirst().get();
    }
}
