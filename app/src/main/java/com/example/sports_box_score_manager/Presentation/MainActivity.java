package com.example.sports_box_score_manager.Presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.sports_box_score_manager.R;
import com.example.sports_box_score_manager.application.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity {
    public static final String extraText = "com.example.sports_box_score_manager.extraText";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            copyDatabaseToDevice();

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
        PreviousGame1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1="Previous Game";
                nextPage2(text1);
            }
        });

    }

    public void openActivity3(){
        EditText edit1 = (EditText) findViewById(R.id.EnterNewGameName);

        String text = edit1.getText().toString();
        Intent intent = new Intent(this, PlayerActivity.class);

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
    public void nextPage2(String text){
        Intent intent = new Intent(this, HistoryActivity.class);
        intent.putExtra(extraText, text);
        startActivity(intent);
    }

    private void copyDatabaseToDevice() {
        final String DB_PATH = "db";

        String[] assetNames;
        Context context = getApplicationContext();
        File dataDirectory = context.getDir(DB_PATH, Context.MODE_PRIVATE);
        AssetManager assetManager = getAssets();

        try {

            assetNames = assetManager.list(DB_PATH);
            for (int i = 0; i < assetNames.length; i++) {
                assetNames[i] = DB_PATH + "/" + assetNames[i];
            }

            copyAssetsToDirectory(assetNames, dataDirectory);

            Main.setDbName(dataDirectory.toString() + "/" + Main.getDbName());
            System.out.println(Main.getDbName());
        } catch (final IOException ioe) {
            Messages.warning(this, "Unable to access application data: " + ioe.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void copyAssetsToDirectory(String[] assets, File directory) throws IOException {
        AssetManager assetManager = getAssets();

        for (String asset : assets) {
            String[] components = asset.split("/");
            String copyPath = directory.toString() + "/" + components[components.length - 1];

            char[] buffer = new char[1024];
            int count;

            File outFile = new File(copyPath);

            if (!outFile.exists()) {
                InputStreamReader in = new InputStreamReader(assetManager.open(asset));
                FileWriter out = new FileWriter(outFile);

                count = in.read(buffer);
                while (count != -1) {
                    out.write(buffer, 0, count);
                    count = in.read(buffer);
                }

                out.close();
                in.close();
            }
        }
    }
}






