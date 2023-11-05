package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class Games extends AppCompatActivity {
    private List<CheckBox> checkBoxList = new ArrayList<>();
    private Button fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);

        checkBoxList.add(findViewById(R.id.checkBox));
        checkBoxList.add(findViewById(R.id.checkBox2));
        checkBoxList.add(findViewById(R.id.checkBox3));
        checkBoxList.add(findViewById(R.id.checkBox4));
        checkBoxList.add(findViewById(R.id.checkBox5));
        checkBoxList.add(findViewById(R.id.checkBox6));
        checkBoxList.add(findViewById(R.id.checkBox7));

        fabButton = findViewById(R.id.floatingActionButton2);
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedGames = getSelectedGames();
                if (selectedGames.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "No has seleccionado ningún juego", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Juegos seleccionados:\n" + selectedGames, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private String getSelectedGames() {
        StringBuilder selectedGames = new StringBuilder();
        for (CheckBox checkBox : checkBoxList) {
            if (checkBox.isChecked()) {
                if (selectedGames.length() > 0) {
                    selectedGames.append(", ");
                }
                selectedGames.append(checkBox.getText());
            }
        }
        return selectedGames.toString();
    }
}
