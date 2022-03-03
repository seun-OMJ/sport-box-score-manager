package COMP3350.Sport_Box_Score_Manager.object;

import java.util.ArrayList;

public class Game {
    private String gameName;
    private ArrayList<String> playerNames;

    public Game(String gameName) {
        this.gameName = gameName;
        playerNames = new ArrayList<String>();

    }

    public void addPlayer(String name) {
        playerNames.add(name);
    }

    public String getGameName() {
        return gameName;
    }

    public ArrayList<String> getAllPlayerName(){
        ArrayList<String> out = new ArrayList<String>();
        out.addAll(playerNames);

        return out;
    }
}

