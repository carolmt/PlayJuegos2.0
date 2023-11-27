package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class NewPlayer extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newplayer);


        String[] telefonos = {"Teléfono 1", "Teléfono 2", "Teéfono 3", "Teléfono 4", "Teléfono 5"};
        Spinner listaTelefonos = findViewById(R.id.spinner2);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,
                telefonos);

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listaTelefonos.setAdapter(adaptador);

        listaTelefonos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String telefonoSeleccionado = telefonos[position];

                // Obtener la referencia al EditText
                EditText editTextTelefono = findViewById(R.id.telefono2);

                // Establecer el valor en el EditText
                editTextTelefono.setText(telefonoSeleccionado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}