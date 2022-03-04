package com.example.sports_box_score_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // int text = R.id.EnterNewGameName;
                //String x = (String) getText(text);
                //  Game game = new Game(x);
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);

    }
}