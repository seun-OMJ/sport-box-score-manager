package com.example.sports_box_score_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                // int text = R.id.EnterNewGameName;
                //String x = (String) getText(text);
                //  Game game = new Game(x);
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        EditText edit1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText edit2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String text = edit1.getText().toString();
        String text2 = edit2.getText().toString();
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra(extraText,text);
        intent.putExtra(extraText2,text2);
        startActivity(intent);




    }
}