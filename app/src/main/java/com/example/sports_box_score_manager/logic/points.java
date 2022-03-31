package com.example.sports_box_score_manager.logic;

import android.widget.TextView;

public class points {
    public static void addScore(TextView text){
        int score =Integer.parseInt(text.getText().toString());
        score++;
        text.setText(String.valueOf(score));}

    public static void subScore(TextView text){
        int score = Integer.parseInt(text.getText().toString());
        if (score>0){
            score--;
        }
        text.setText(String.valueOf(score));
    }
}
