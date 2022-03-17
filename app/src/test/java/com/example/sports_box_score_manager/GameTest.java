package com.example.sports_box_score_manager;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {


    @Test
    public void gameTest()
    {
        Game Game1 = new Game("Game1", "Jass");
        Game Game2 = new Game("Game2", "Aadi");
        Game Game3 = new Game("Game3", "Sid");

        assert (Game1 != null);
        assert (Game2 != null);
        assert (Game3 != null);

        assert(Game1.getGameName().equals("Game1"));
        assert(Game2.getGameName().equals("Game2"));
        assert(Game3.getGameName().equals("Game3"));

        assert(Game1.getPlayerName().equals("Jass"));
        assert(Game1.getPlayerName().equals("Aadi"));
        assert(Game1.getPlayerName().equals("Sid"));

        assertEquals(Game1.getScore(),0);

        System.out.println("Test 1 Passed!");
    }
}