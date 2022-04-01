package com.example.sports_box_score_manager.application;



public class Main {
    private static String dbName = "gamedb";

    public static void setDbName(final String name) throws Exception {
        try {
            Class.forName("org.hsqldb.jdbcDriver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        dbName = name;
    }

    public static String getDbName(){
        return dbName;
    }
}
