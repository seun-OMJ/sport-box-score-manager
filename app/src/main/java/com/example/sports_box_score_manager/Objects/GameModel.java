package com.example.sports_box_score_manager.Objects;

public class GameModel {
    private int gameId;
    private String gameName;
    private String player1Name;
    private String player2Name;
    private int score1;
    private int score2;

    //constructurs
    public GameModel(int gameId, String gameName, String player1Name, String player2Name, int score1, int score2) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.score1 = score1;
        this.score2 = score2;
    }

    public GameModel(int gameID) {
        this.gameId = gameId;
    }

    //getters and setters
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }
    public void setScore1(int score){
        this.score1 = score;
    }
    public void setScore2(int score){
        this.score2 = score;
    }
    public int getScore1(){
        return this.score1;
    }
    public int getScore2(){
        return this.score2;
    }

    //toString

    @Override
    public String toString() {
        return "GameModel{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", player1Name='" + player1Name + '\'' +
                ", player2Name='" + player2Name + '\'' +
                '}';
    }
}
