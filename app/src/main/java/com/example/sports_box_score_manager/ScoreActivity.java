package com.example.sports_box_score_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        String text = intent.getStringExtra(PlayerActivity.extraText);
        String text2 = intent.getStringExtra(PlayerActivity.extraText2);

        TextView textView1 = findViewById(R.id.textView8);
        TextView textView2 = findViewById(R.id.textView10);
        textView1.setText(text);
        textView2.setText(text2);
    }
}