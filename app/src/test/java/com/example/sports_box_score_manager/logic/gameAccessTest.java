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
    public void insert(){
        GameAccess access = new GameAccess();
        GameModel gameModel = new GameModel(0,"testGame","player1","player2","player3","player4");
        assertEquals(access.insertGame(gameModel),gameModel);
        access.deleteCourse(gameModel);

        assertEquals(access.getCurrentGame(),0);




    }


}
