package com.example.sports_box_score_manager.Presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.sports_box_score_manager.R;


public class MainActivity extends AppCompatActivity {
    public static final String extraText = "com.example.sports_box_score_manager.extraText";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Click listener for Save And Conitnue button
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        // Click listeners for Previous Game buttons
        Button PreviousGame1 = (Button) findViewById(R.id.button6);
        Button PreviousGame2 = (Button) findViewById(R.id.button7);
        Button PreviousGame3 = (Button) findViewById(R.id.button8);
        PreviousGame1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1="Previous Game 1";
                nextPage(text1);
            }
        });
        PreviousGame2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String text2="Previous Game 2";
                nextPage(text2);
            }
        });
        PreviousGame3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String text3="Previous Game 3";
                nextPage(text3);
            }
        });
    }

    public void openActivity3(){
        EditText edit1 = (EditText) findViewById(R.id.EnterNewGameName);

        String text = edit1.getText().toString();
        Intent intent = new Intent(this, PlayerActivity.class);
        //intent.putExtra(extraText, text);

        if(text.length()==0 | text.length()>25){
            edit1.setError("Invalid Input");
        }else {
            intent.putExtra(extraText, text);
            nextPage(text);
        }
    }
    public void nextPage(String text){
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra(extraText, text);
        startActivity(intent);
    }

    public static class Game {
        private String gameName;
        private String playerName;
        private int score;

        public Game(String gameName, String playerName) {
            this.gameName = gameName;
            this.playerName = playerName;
            score = 0;
        }

        public String getGameName() {
            return gameName;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }
}
