package com.example.sports_box_score_manager.DataBase.HSQLDB;

public class GameException extends RuntimeException {
    public GameException(final Exception cause){
        super(cause);
    }
}
