package com.example.playjuegos;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GenerosAdapter extends RecyclerView.Adapter<GenerosAdapter.ViewHolder>{

    private String[] datosGeneros = {"Acción", "Aventura", "Deportes", "Disparos","Estrategia", "Lucha", "Musical", "Rol", "Simulación" };



    public static class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView textoElemento;

        public ViewHolder(View view) {
            super(view);
            textoElemento = view.findViewById(R.id.recyclerGeneros);
        }

        public TextView getTextoElemento() {
            return textoElemento;
        }

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_item, viewGroup, false);

        return new ViewHolder(view);
    }
    @Override //metodo del adaptador
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        String genero = datosGeneros[position];
// Asegúrate de que viewHolder y viewHolder.textoElemento no sean nulos
    if (viewHolder != null && viewHolder.textoElemento != null) {
        viewHolder.textoElemento.setText(genero);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), genero, Toast.LENGTH_SHORT).show();
            }
        });
    } else {
        // Manejar el caso en el que viewHolder o viewHolder.textoElemento sea nulo
        Log.e("GenerosAdapter", "ViewHolder o TextView es nulo en la posición: " + position);
    }

    }
    @Override
    public int getItemCount() {
        return datosGeneros.length;
    }
}
