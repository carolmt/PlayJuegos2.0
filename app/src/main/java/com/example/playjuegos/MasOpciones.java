package com.example.playjuegos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MasOpciones extends AppCompatActivity {
    private FloatingActionButton fabButton;
    private Button accion;
    private Button aventura;
    private Button deportes;
    private Button disparos;
    private Button estrategia;
    private Button lucha;
    private Button musical;
    private Button rol;
    private Button simulacion;

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
        setContentView(R.layout.masopciones);
        accion = findViewById(R.id.accion);
        aventura = findViewById(R.id.aventura);
        deportes = findViewById(R.id.deportes);
        disparos = findViewById(R.id.disparos);
        estrategia = findViewById(R.id.estrategia);
        lucha = findViewById(R.id.lucha);
        musical = findViewById(R.id.musical);
        rol = findViewById(R.id.rol);
        simulacion = findViewById(R.id.simulacion);

        ps4 = findViewById(R.id.ps4);
        pc = findViewById(R.id.pc);
        xbox = findViewById(R.id.xbox);
        wii = findViewById(R.id.wii);
        wiiu = findViewById(R.id.wiiu);
        ds = findViewById(R.id.ds);
        x360 = findViewById(R.id.x360);

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

        accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        aventura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        deportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        disparos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        estrategia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        lucha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        musical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        rol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });
        simulacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = getSeleccionGenero();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

        });

    }
    private String getSeleccionGenero() {

        if (accion.isPressed()) {
            return "Accion";
        } else if (aventura.isPressed()) {
            return "Aventura";
        } else if (deportes.isPressed()) {
            return "Deportes";
        } else if (disparos.isPressed()) {
            return "Disparos";
        } else if (estrategia.isPressed()) {
            return "Estreategia";
        } else if (lucha.isPressed()) {
            return "Lucha";
        } else if (musical.isPressed()) {
            return "Musical";
        } else if (rol.isPressed()) {
            return "Rol";
        } else if (simulacion.isPressed()) {
            return "Simulación";
        } else {
            return null;
        }
    }
    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

