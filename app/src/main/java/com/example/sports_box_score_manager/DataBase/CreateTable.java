package com.example.sports_box_score_manager.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        int result = 0;

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
            stmt = con.createStatement();

            result = stmt.executeUpdate("CREATE TABLE tutorials_tbl ( id INT NOT NULL, TeamName VARCHAR(50) NOT NULL," +
                    " Player1Name VARCHAR(20) NOT NULL, Player2Name VARCHAR(20) NOT NULL,Player3Name VARCHAR(20) NOT NULL, Player4Name VARCHAR(20) NOT NULL, PRIMARY KEY (id)); ");
        }  catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println("Table created successfully");
    }
}
