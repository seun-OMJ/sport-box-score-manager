package com.example.sports_box_score_manager;

import java.util.ArrayList;

public class Database {
    private ArrayList<Game> game;

    public Database() {
        game = new ArrayList<Game>();
    }

    public void addPlayer(String gameName, String playerName) {

        if (!contain(gameName, playerName))
            game.add(new Game(gameName, playerName));
    }

    public void addScore(String gameName, String playerName, int score) {
        for (int i = 0; i < game.size(); i++) {
            if (game.get(i).getGameName().equals(gameName) && game.get(i).getPlayerName().equals(playerName)) {
                game.get(i).setScore(score);
                break;
            }
        } // end for
    } // end add Score

    public ArrayList<String> getAllGameName() {
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i < game.size(); i++) {
            if (!out.contains(game.get(i).getGameName()))
                out.add(game.get(i).getGameName());
        }
        return out;
    }

    public ArrayList<String> getAllPlayerName(String gameName) {
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i < game.size(); i++) {
            if (game.get(i).getGameName().equals(gameName))
                out.add(game.get(i).getPlayerName());
        }
        return out;
    }


    // return -1 if player doesn't exist in that game
    public int getPlayerScore(String gameName, String playerName) {
        int score = -1;

        for (int i = 0; i < game.size(); i++) {
            if (game.get(i).getGameName().equals(gameName) && game.get(i).getPlayerName().equals(playerName)) {
                score = game.get(i).getScore();
                break;
            }
        } // end for

        return score;
    } // end getPlayerScore

    private boolean contain(String gameName, String playerName) {
        boolean contain = false;

        for (int i = 0; i < game.size(); i++) {
            if (game.get(i).getGameName().equals(gameName) && game.get(i).getPlayerName().equals(playerName)) {
                contain = true;
                break;
            }
        } // end for

        return contain;
    } // end contain
}
