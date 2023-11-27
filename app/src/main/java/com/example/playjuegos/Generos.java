package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class Generos extends AppCompatActivity {
    private FloatingActionButton fabButton;

    private Chip ps4;
    private Chip pc;
    private Chip xbox;
    private Chip wii;
    private Chip wiiu;
    private Chip ds;
    private Chip x360;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generos);

        ps4 = findViewById(R.id.ps4);
        pc = findViewById(R.id.pc);
        xbox = findViewById(R.id.xbox);
        wii = findViewById(R.id.wii);
        wiiu = findViewById(R.id.wiiu);
        ds = findViewById(R.id.ds);
        x360 = findViewById(R.id.x360);

        fabButton = findViewById(R.id.floatingActionButton);


        // Obtener la referencia del RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerGeneros);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        GenerosAdapter adapter = new GenerosAdapter();

        recyclerView.setAdapter(adapter);


        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = new TranslateAnimation(0, 0, 0, -200);
                anim.setDuration(500);
                fabButton.startAnimation(anim);

                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {}

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Snackbar.make(v, "El botón se desplaza hacia arriba.", Snackbar.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {}
                });
            }
        });

        ps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("PS4");
            }
        });

        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("PC");
            }
        });

        xbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("XBOX");
            }
        });

        wii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("WII");
            }
        });

        wiiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("WIIU");
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("3DS");
            }
        });

        x360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("X360");
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

