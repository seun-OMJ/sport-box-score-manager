package com.example.sports_box_score_manager.Presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sports_box_score_manager.Objects.GameModel;
import com.example.sports_box_score_manager.R;
import com.example.sports_box_score_manager.logic.GameAccess;

public class HistoryActivity extends AppCompatActivity {
    public GameAccess access;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        access = new GameAccess();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        GameModel model = access.getSequential();
        TextView gameName = findViewById(R.id.textView2);
        TextView team1 = findViewById(R.id.textView6);
        TextView team2 = findViewById(R.id.textView9);
        TextView score1 = findViewById(R.id.textView10);
        TextView score2 = findViewById(R.id.textView13);
        System.out.println(model.getGameName());
        System.out.println(model.getPlayer1Name());
        System.out.println(model.getPlayer2Name());
        System.out.println(model.getScore1());
        System.out.println(model.getScore2());
        gameName.setText(model.getGameName());
        team1.setText(model.getPlayer1Name());
        team2.setText(model.getPlayer2Name());
        score1.setText(String.valueOf(model.getScore1()));
        score2.setText(String.valueOf(model.getScore2()));
    }
}