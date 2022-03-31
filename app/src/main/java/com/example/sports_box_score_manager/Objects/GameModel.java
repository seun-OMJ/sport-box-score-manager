package com.example.sports_box_score_manager.Objects;

public class GameModel {
    private int gameId;
    private String gameName;
    private String player1Name;
    private String player2Name;
    private String player3Name;
    private String player4Name;
    //constructurs
    public GameModel(int gameId, String gameName, String player1Name,
                     String player2Name, String player3Name, String player4Name) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player3Name = player3Name;
        this.player4Name = player4Name;
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

    public String getPlayer3Name() {
        return player3Name;
    }

    public void setPlayer3Name(String player3Name) {
        this.player3Name = player3Name;
    }

    public String getPlayer4Name() {
        return player4Name;
    }

    public void setPlayer4Name(String player4Name) {
        this.player4Name = player4Name;
    }
    //toString

    @Override
    public String toString() {
        return "GameModel{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", player1Name='" + player1Name + '\'' +
                ", player2Name='" + player2Name + '\'' +
                ", player3Name='" + player3Name + '\'' +
                ", player4Name='" + player4Name + '\'' +
                '}';
    }
}
