package com.example.sports_box_score_manager.DataBase.HSQLDB;


import com.example.sports_box_score_manager.DataBase.GameData;
import com.example.sports_box_score_manager.Objects.GameModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class GameHSQLDB implements GameData {
    private final String dbpath;
    public GameHSQLDB(final String dbpath){
        this.dbpath = dbpath;
    }
    private Connection connection() throws SQLException{
        return DriverManager.getConnection("jdbc:hsqldb:file:"+dbpath+";shutdown=true","SA","");
    }
    private GameModel fromResultSet(final ResultSet rs) throws SQLException {
        final int gameID = rs.getInt(0);
        final String gameName = rs.getString("name");
        final String p1 = rs.getString("player1");
        final String p2 = rs.getString("player2");
        final String p3 = rs.getString("player3");
        final String p4 = rs.getString("player4");


        return new GameModel(gameID, gameName,p1,p2,p3,p4);
    }

    public List<GameModel> getGameSequential() {
        final List<GameModel> gameModels = new ArrayList<>();
        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT * FROM gameModels");
            while (rs.next()){
                final GameModel games = fromResultSet(rs);
                gameModels.add(games);
            }
            rs.close();
            st.close();

            return gameModels;
        } catch (final SQLException e) {
            throw new GameException(e);
        }
    }

    public List<GameModel> getGameRandom(GameModel game) {
        final List<GameModel> games = new ArrayList<>();

        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("SELECT * FROM games WHERE gameID=?");
            st.setInt(1, game.getGameId());

            final ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                final GameModel gameModel = fromResultSet(rs);
                games.add(gameModel);
            }
            rs.close();
            st.close();

            return games;
        }
        catch (final SQLException e)
        {
            throw new GameException(e);
        }
    }

    @Override
    public GameModel addGame(GameModel game) {
        try(final Connection c = connection()){
            final PreparedStatement st = c.prepareStatement("INSERT INTO games VALUES(?, ?, ?, ?, ?, ?)");
            st.setInt(1, game.getGameId());
            st.setString(2, game.getGameName());
            st.setString(3,game.getPlayer1Name());
            st.setString(4, game.getPlayer2Name());
            st.setString(5,game.getPlayer3Name());
            st.setString(6,game.getPlayer4Name());
            st.executeUpdate();

        } catch (SQLException e) {
            throw new GameException(e);
        }
        return game;

    }

    @Override
    public void deleteGame(GameModel game) {
        try(final Connection c = connection()){
            final PreparedStatement st = c.prepareStatement("DELETE FROM games WHERE gameID = ?");
            st.setInt(1, game.getGameId());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new GameException(e);
        }
    }

    public GameModel updateGame(GameModel game){
        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("UPDATE games SET name = ? WHERE gameID = ?");
            st.setInt(1, game.getGameId());
            st.setString(2, game.getGameName());
            st.setString(3,game.getPlayer1Name());
            st.setString(4, game.getPlayer2Name());
            st.setString(5,game.getPlayer3Name());
            st.setString(6,game.getPlayer4Name());

            st.executeUpdate();

            return game;
        } catch (final SQLException e) {
            throw new GameException(e);
        }
    }
}
