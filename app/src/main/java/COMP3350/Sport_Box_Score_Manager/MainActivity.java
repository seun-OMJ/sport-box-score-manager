package COMP3350.Sport_Box_Score_Manager;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.zip.Inflater;

import COMP3350.Sport_Box_Score_Manager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                EditText GameName= (EditText) findViewById(R.id.editTextTextPersonName3);
                final TextView PreviousGame1= (TextView) findViewById(R.id.PreviousGame1);
                final TextView PreviousGame2= (TextView) findViewById(R.id.PreviousGame2);
                final TextView PreviousGame3= (TextView) findViewById(R.id.PreviousGame3);
                PreviousGame1.setText(GameName.getText());
                PreviousGame2.setText(GameName.getText());
                PreviousGame3.setText(GameName.getText());
            }
        });
    }

}

