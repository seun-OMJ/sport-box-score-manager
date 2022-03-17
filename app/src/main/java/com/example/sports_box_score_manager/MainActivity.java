package com.example.sports_box_score_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String extraText = "com.example.sports_box_score_manager.extraText";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    public void openActivity3(){
        EditText edit1 = (EditText) findViewById(R.id.EnterNewGameName);
        String text = edit1.getText().toString();
        if(text.length()==0 | text.length()>25){
            edit1.setError("Invalid Input");
        }else {
            Intent intent = new Intent(this, PlayerActivity.class);
            intent.putExtra(extraText, text);
            startActivity(intent);
        }
    }
}
