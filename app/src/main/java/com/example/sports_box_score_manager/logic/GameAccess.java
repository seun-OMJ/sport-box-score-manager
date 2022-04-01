package com.example.sports_box_score_manager.logic;

import com.example.sports_box_score_manager.DataBase.GameData;
import com.example.sports_box_score_manager.Objects.GameModel;
import com.example.sports_box_score_manager.application.Services;

import java.util.Collections;
import java.util.List;

public class GameAccess {
    private GameData gameData;
    private List<GameModel> games;
    private GameModel gameModel;
    private int currentGame;

    public GameAccess() {
        gameData = Services.getGameHSQLDB();
        games = null;
        gameModel = null;
        currentGame = 0;
    }


    public GameAccess(final GameData gameData) {
        this.gameData = gameData;
    }


    public List<GameModel> getGames() {
        games = gameData.getGameSequential();
        return Collections.unmodifiableList(games);
    }


    public GameModel getSequential() {
        if (games == null) {
            games = gameData.getGameSequential();
            currentGame = 0;
        }
        if (currentGame < games.size()) {
            gameModel = games.get(currentGame);
            currentGame++;
        } else {
            games = null;
            gameModel = null;
            currentGame = 0;
        }
        return gameModel;
    }

    public GameModel getRandom(int gameID) {
        games = gameData.getGameRandom(new GameModel(gameID));
        currentGame = 0;
        if (currentGame < games.size()) {
            gameModel = games.get(currentGame);
            currentGame++;
        } else {
            games = null;
            gameModel = null;
            currentGame = 0;
        }
        return gameModel;
    }

    public GameModel insertGame(GameModel crntGame) {
        return gameData.addGame(crntGame);
    }

    public GameModel updateGame(GameModel crntGame) {
        return gameData.updateGame(crntGame);
    }

    public void deleteGame(GameModel crntGame) {
        gameData.deleteGame(crntGame);
    }

    public int getCurrentGame() {
        return currentGame;
    }
}

