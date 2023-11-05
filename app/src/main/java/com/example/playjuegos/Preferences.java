package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.SeekBar;
import android.widget.RatingBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Preferences extends AppCompatActivity {
    private RadioGroup radioGroup;
    private SeekBar seekBar;
    private RatingBar ratingBar;
    private FloatingActionButton fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);
        radioGroup = findViewById(R.id.radioGroup);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);
        fabButton = findViewById(R.id.floatingActionButton);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                // Actualiza la posición de la SeekBar cuando cambia la valoración
                seekBar.setProgress((int) rating);
            }
        });
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedGame = getSelectedGame();
                int progress = seekBar.getProgress();
                float rating = ratingBar.getRating();

                if (selectedGame == null) {
                    Toast.makeText(getApplicationContext(), "No has pulsado ninguna opción", Toast.LENGTH_LONG).show();
                } else {
                    String message =  selectedGame + " puntuación: " + rating;
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private String getSelectedGame() {
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.angryBirds) {
            return "Angry Birds";
        } else if (checkedRadioButtonId == R.id.dragonFly) {
            return "Dragon Fly";
        } else if (checkedRadioButtonId == R.id.hillClimbing) {
            return "Hill Climbing Racing";
        } else if (checkedRadioButtonId == R.id.pocketSoccer) {
            return "Pocket Soccer";
        } else if (checkedRadioButtonId == R.id.radiantDefense) {
            return "Radiant Defense";
        } else {
            return null;
        }
    }
}
