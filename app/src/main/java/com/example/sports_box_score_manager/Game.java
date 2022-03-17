package com.example.sports_box_score_manager;

public class Game {
    private String gameName;
    private String playerName;
    private int score;

    public Game(String gameName, String playerName) {
        this.gameName = gameName;
        this.playerName = playerName;
        score = 0;
    }

    public String getGameName() {
        return gameName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
