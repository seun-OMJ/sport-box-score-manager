package com.example.sports_box_score_manager.application;

import com.example.sports_box_score_manager.DataBase.HSQLDB.GameHSQLDB;

public class Services {
    private static GameHSQLDB gameData = null;
    public static synchronized GameHSQLDB getGameHSQLDB(){
        if (gameData == null)
        {
            gameData = new GameHSQLDB(Main.getDbName());
        }
        return gameData;
    }
}
