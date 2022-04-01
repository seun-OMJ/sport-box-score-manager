package com.example.sports_box_score_manager.logic;
import org.junit.Test;

import static org.junit.Assert.*;

import com.example.sports_box_score_manager.Objects.GameModel;


public class gameAccessTest {
    @Test
    public void create(){
        GameAccess access = new GameAccess();
        assertNotNull(access);
    }
    @Test
    public void crudTest(){//testing insert, update and delete from hsqldb
        GameAccess access = new GameAccess();
        GameModel gameModel = new GameModel(0,"testGame","player1","player2","player3","player4");
        assertEquals(access.insertGame(gameModel),gameModel);

        gameModel.setGameName("editedName");
        gameModel.setPlayer1Name("edited_p1");
        gameModel.setPlayer2Name("edited_p2");
        gameModel.setPlayer3Name("edited_3");
        gameModel.setPlayer4Name("edited_4");

        assertEquals(access.updateGame(gameModel),gameModel);
        access.deleteGame(gameModel);
        assertEquals(access.getCurrentGame(),0);




    }


}
