package com.example.sports_box_score_manager.DataBase;

import com.example.sports_box_score_manager.Objects.GameModel;

import java.util.List;

public interface GameData {
     GameModel addGame(GameModel game);
     void deleteGame(GameModel game);
     List<GameModel> getGameSequential();
     List<GameModel> getGameRandom(GameModel game);
     GameModel updateGame(GameModel game);
}
