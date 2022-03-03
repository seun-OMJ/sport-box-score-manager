package COMP3350.Sport_Box_Score_Manager.database;

import java.util.ArrayList;

import COMP3350.Sport_Box_Score_Manager.object.Game;
import COMP3350.Sport_Box_Score_Manager.object.PlayerScore;

public class Database {
    private ArrayList<Game> games;
    private ArrayList<PlayerScore> playerScore;

    public Database() {
        games = new ArrayList<Game>();
        playerScore = new ArrayList<PlayerScore>();
    }

    public void addGame(String name) {
        if (!containGame(name))
            games.add(new Game(name));
    }

    public void addPlayer(String gameName, String playerName) {
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getGameName().equals(playerName))
                games.get(i).addPlayer(playerName);
        }
    }

    public void addScore(String gameName, String playerName, int score) {
        playerScore.add(new PlayerScore(gameName, playerName, score));
    }

    public ArrayList<Game> getAllGame() {
        ArrayList<Game> out = new ArrayList<Game>();
        out.addAll(games);

        return out;
    }

    public int getScore(String gameName, String playerName) {
        int score = -1;

        for (int i = 0; i < playerScore.size(); i++) {
            if (playerScore.get(i).getGameName().equals(gameName)
                    && playerScore.get(i).getPlayerName().equals(playerName)) {
                score = playerScore.get(i).getScore();
                break;
            }
        }

        return score;
    }

    private boolean containGame(String gameName) {
        boolean contain = false;

        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getGameName().equals(gameName)) {
                contain = true;
                break;
            }
        }

        return contain;
    }
}
