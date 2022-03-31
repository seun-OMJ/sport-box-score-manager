package com.example.sports_box_score_manager.Presentation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sports_box_score_manager.Presentation.MainActivity;
import com.example.sports_box_score_manager.Presentation.PlayerActivity;
import com.example.sports_box_score_manager.R;

import java.util.Timer;
import java.util.TimerTask;

public class ScoreActivity extends AppCompatActivity {
            TextView score1,score2,score3,score4, timerText;
            Button add1,sub1,add2,sub2,add3,sub3,add4,sub4, reset,save, timerStartBtn, timerResetBtn;

            boolean timerStarted = false;
            Timer timer;
            TimerTask timerTask;
            Double time = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        timerText = (TextView) findViewById(R.id.text_view_timer);
        timerStartBtn = (Button) findViewById(R.id.button_start);
        timer = new Timer();

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
        score3= findViewById(R.id.textView9);
        score4= findViewById(R.id.textView15);

        add1 = findViewById(R.id.button12);
        sub1 = findViewById(R.id.button13);
        add2 = findViewById(R.id.button9);
        sub2 = findViewById(R.id.button11);
        add3 = findViewById(R.id.button2);
        sub3 = findViewById(R.id.button4);
        add4 = findViewById(R.id.button5);
        sub4 = findViewById(R.id.button10);

        reset = findViewById(R.id.resetButton);
        save= findViewById(R.id.saveButton);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScore(score1);
            }
        });
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    addScore(score2);
            }
        });
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScore(score3);
            }
        });
        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScore(score4);
            }
        });

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subScore(score1);
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subScore(score2);
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subScore(score3);
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subScore(score4);
            }
        });
    }

    public void addScore(TextView text){
        int score =Integer.parseInt(text.getText().toString());
        score++;
        text.setText(String.valueOf(score));

    }
    public void subScore(TextView text){
        int score = Integer.parseInt(text.getText().toString());
        if (score>0){
            score--;
        }
        text.setText(String.valueOf(score));
    }
    //Developer Tasks to reset or save all the score
    public void reset(){
        score1.setText("0");
        score2.setText("0");
        score3.setText("0");
        score4.setText("0");
    }
    public void save(){
        //INSERT INTO tutorials_tbl VALUES (100,'Learn PHP', 'John Poul', NOW());
        reset();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startBtnTapped(View view) {
        if(timerStarted == false) {
            timerStarted=true;
            timerStartBtn.setText("pause");
            startTimer();
        } else {
            timerStarted = false;
            timerStartBtn.setText("start");
            timerTask.cancel();
        }
    }

    public void startTimer() {
        timerTask = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        time++;
                        timerText.setText(getTimerText());
                    }
                });

            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    public void resetTapped(View view) {
        AlertDialog.Builder resetAlert = new AlertDialog.Builder(this);
        resetAlert.setTitle("Reset Timer");
        resetAlert.setMessage("Reset the timer?");
        resetAlert.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(timerTask != null) {
                    timerTask.cancel();
                    time = 0.0;
                    timerStarted = false;
                    timerText.setText(formatTime(0,0,0));
                }
            }
        });
        resetAlert.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

           }
        });
        resetAlert.show();
    }

    private String getTimerText() {
        int rounded = (int) Math.round(time);
        int seconds = ((rounded % 86400) % 3600) % 60;
        int minutes = ((rounded % 86400) % 3600) / 60;
        int hours = ((rounded % 86400) / 3600);

        return formatTime(seconds, minutes, hours);

    }

    private String formatTime(int secs, int mins, int hrs) {
        return String.format("%02d", hrs) + " : " + String.format("%02d", mins) + " : " + String.format("%02d",secs);
    }
}