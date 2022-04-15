package com.example.sports_box_score_manager.logic;
import org.junit.Test;

import static org.junit.Assert.*;

import com.example.sports_box_score_manager.Objects.GameModel;


public class gameAccessTest {

    GameAccess access = new GameAccess();
    GameModel gameModel = new GameModel(0,"testGame","player1","player2");
    @Test
    public void create(){
        GameAccess access = new GameAccess();
        assertNotNull(access);
    }
    @Test
    public void insertTest(){//testing insert, update and delete from hsqldb
        assertEquals(access.insertGame(gameModel),gameModel);}
    @Test
    public void updateTest(){
        gameModel.setGameName("editedName");
        gameModel.setPlayer1Name("edited_p1");
        gameModel.setPlayer2Name("edited_p2");

        assertEquals(access.updateGame(gameModel),gameModel);}
    @Test
            public void deleteTest(){
        access.deleteGame(gameModel);
        assertEquals(access.getCurrentGame(),0);
    }


}
