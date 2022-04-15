package com.example.sports_box_score_manager.Presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sports_box_score_manager.R;

public class PlayerActivity extends AppCompatActivity {
    public static final String extraText = "com.example.sports_box_score_manager.extraText";
    public static final String extraText2 = "com.example.sports_box_score_manager.extraText2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.extraText);
        Button button = findViewById(R.id.button);
        TextView text1 = findViewById(R.id.EnterGameName);
        text1.setText(text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        EditText edit1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText edit2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String text1 = edit1.getText().toString();
        String text2 = edit2.getText().toString();
        if(text1.length()==0 | text1.length()>25){
            edit1.setError("Invalid Input for Player 1");
        }else if(text2.length()==0 | text2.length()>25) {
            edit2.setError("Invalid Input for Player 2");
        }else{
            nextPage(text1,text2);
        }
    }
    public void nextPage(String text1,String text2){
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra(extraText,text1);
        intent.putExtra(extraText2,text2);
        startActivity(intent);
    }
}