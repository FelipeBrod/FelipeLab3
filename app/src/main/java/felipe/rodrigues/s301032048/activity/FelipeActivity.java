package felipe.rodrigues.s301032048.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import felipe.rodrigues.s301032048.R;
import felipe.rodrigues.s301032048.fragments.FelipeFragment;
import felipe.rodrigues.s301032048.fragments.RodriguesFragment;
import felipe.rodrigues.s301032048.fragments.S301032048Fragment;

public class FelipeActivity extends AppCompatActivity {


     private Button frag1, frag2, frag3;

     private FelipeFragment felipeFragment;
     private RodriguesFragment rodriguesFragment;
     private S301032048Fragment s301032048Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felipe);

        //Removing shadow from action bar
        getSupportActionBar().setElevation(0);

        //instanciating

        felipeFragment = new FelipeFragment();
        rodriguesFragment = new RodriguesFragment();
        s301032048Fragment = new S301032048Fragment();


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, rodriguesFragment); //which frag and where
        transaction.commit(); //finalizing transactions

        frag1 = findViewById(R.id.buttonFelipeFrag);
        frag2 = findViewById(R.id.buttonRodriguesFrag);
        frag3 = findViewById(R.id.buttonS301032048Frag);

        frag1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, felipeFragment);
                transaction.commit();

            }
        });

        frag2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, rodriguesFragment);
                transaction.commit();

            }
        });

        frag3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, s301032048Fragment);
                transaction.commit();

            }
        });


    }
}