package felipe.rodrigues.s301032048.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import felipe.rodrigues.s301032048.R;

public class FelipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Removing shadow from action bar
        getSupportActionBar().setElevation(0);
    }
}