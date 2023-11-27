package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button games = findViewById(R.id.button);
        Button jugador = findViewById(R.id.button2);
        Button preferences = findViewById(R.id.button3);

        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {lanzarGames();
            }
        });
        jugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {lanzarNewPlayer();
            }
        });
        preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarPreferences();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_buscar) {
            Intent intent = new Intent(this, Generos.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_add){
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }
    public void masOpciones(MenuItem item) {
        Intent i = new Intent(this, Generos.class);
        startActivity(i);
    }
    public void lanzarGames() {
        Intent i = new Intent(this, Games.class);
        startActivity(i);
    }
    public void lanzarNewPlayer() {
        Intent i = new Intent(this, NewPlayer.class);
        startActivity(i);
    }
    public void lanzarPreferences() {
        Intent i = new Intent(this, Preferences.class);
        startActivity(i);
    }

}
