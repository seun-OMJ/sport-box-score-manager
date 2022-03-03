package COMP3350.Sport_Box_Score_Manager.object;

public class PlayerScore {
    private String gameName;
    private String playerName;
    private int score;

    public PlayerScore(String gameName, String playerName, int score) {
        this.gameName = gameName;
        this.playerName = playerName;
        this.score = score;
    }

    public String getGameName() {
        return gameName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

}
