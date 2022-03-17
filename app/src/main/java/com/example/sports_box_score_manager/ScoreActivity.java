package com.example.sports_box_score_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
            TextView score1,score2,score3,score4;
            Button add1,sub1,add2,sub2,add3,sub3,add4,sub4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        String text = intent.getStringExtra(PlayerActivity.extraText);
        String text2 = intent.getStringExtra(PlayerActivity.extraText2);
        String text3 = intent.getStringExtra(PlayerActivity.extraText3);
        String text4 = intent.getStringExtra(PlayerActivity.extraText4);

        TextView textView1 = findViewById(R.id.textP1Name);
        TextView textView2 = findViewById(R.id.textP2Name);
        TextView textView3 = findViewById(R.id.textP3Name);
        TextView textView4 = findViewById(R.id.textP4Name);

        textView1.setText(text);
        textView2.setText(text2);
        textView3.setText(text3);
        textView4.setText(text4);

        score1 = findViewById(R.id.textView7);
        score2 = findViewById(R.id.textView12);
        add1 = findViewById(R.id.button12);
        sub1 = findViewById(R.id.button13);
        add2 = findViewById(R.id.button9);
        sub2 = findViewById(R.id.button11);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = score1.getText().toString();
                int score = Integer.parseInt(text);
                score++;
                score1.setText(String.valueOf(score));
            }
        });
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = score2.getText().toString();
                int score = Integer.parseInt(text);
                score++;
                score2.setText(String.valueOf(score));
            }
        });

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = score1.getText().toString();
                int score = Integer.parseInt(text);
                if (score>0){
                score--;}
                score1.setText(String.valueOf(score));
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = score2.getText().toString();
                int score = Integer.parseInt(text);
                if(score>0){
                score--;}
                score2.setText(String.valueOf(score));
            }
        });





    }

    public void add(int num,TextView text,View view){
        num++;
        text.setText(""+num);

    }
    public void subtract(int num, TextView text, View view){
        num--;
        text.setText(""+num);
    }
    public void work(Button b, TextView sc){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String text = sc.getText().toString();
               int score = Integer.parseInt(text);
               if(b.getText()=="+"){
                   score++;
               }
               else if(b.getText()=="-"){
                   score--;
               }
               sc.setText(String.valueOf(score));
            }
        });
    }
}