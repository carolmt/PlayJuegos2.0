package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        RecyclerView recyclerView = findViewById(R.id.recyclerAbout);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemAbout ia = new ItemAbout( R.drawable.image1, "María Mata", "2014");
        ItemAbout ia2 = new ItemAbout( R.drawable.image2, "Antonio Sanz", "1890");
        ItemAbout ia3 = new ItemAbout( R.drawable.image3, "Carlos", "967");
        ItemAbout ia4 = new ItemAbout( R.drawable.image4, "Berta", "945");
        ItemAbout ia5 = new ItemAbout( R.drawable.image5, "Héctor Campos", "879");
        ItemAbout ia6 = new ItemAbout( R.drawable.image6, "Ismael", "678");
        ItemAbout ia7 = new ItemAbout( R.drawable.image7, "Juan García", "1995");
        ItemAbout ia8 = new ItemAbout( R.drawable.image8, "Carolina Maldonado", "2000");

        List<ItemAbout> datosAbout = new ArrayList<>();
        datosAbout.add(ia);
        datosAbout.add(ia2);
        datosAbout.add(ia3);
        datosAbout.add(ia4);
        datosAbout.add(ia5);
        datosAbout.add(ia6);
        datosAbout.add(ia7);
        datosAbout.add(ia8);

        AboutAdapter adapter = new AboutAdapter(datosAbout);
        recyclerView.setAdapter(adapter);
    }
    // Implementar el método onItemClick de la interfaz OnItemClickListener

    public void onItemClick(ItemAbout itemAbout) {
        showToast(itemAbout.getNombre());
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}