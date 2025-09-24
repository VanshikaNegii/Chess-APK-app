package com.example.R KARTIKEYAN.chess;

import com.example.R KARTIKEYAN.chess.Pieces.Piece;

/**
 * Created by R Kartikeyan on 17-11-2023
 */

public class Position {
    private Piece piece;


    Position(Piece piece ) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;

    }

    void setPiece(Piece piece) {
        this.piece = piece;
    }

}
