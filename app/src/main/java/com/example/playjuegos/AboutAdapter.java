package com.example.playjuegos;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.ViewHolder> {

    private List<ItemAbout> datosAbout;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombreTextView;
        private final ImageView img;
        private final TextView anyo;

        public ViewHolder(View view) {
            super(view);

            img = (ImageView) view.findViewById(R.id.aboutImg);
            nombreTextView = (TextView) view.findViewById(R.id.aboutNombre);
            anyo = (TextView) view.findViewById(R.id.aboutFecha);
        }

        public TextView getNombreTextView() {
            return nombreTextView;
        }

        public ImageView getImg() {
            return img;
        }

        public TextView getAnyo() {
            return anyo;
        }
    }

    public AboutAdapter(List<ItemAbout> datosAbout) {
        this.datosAbout = datosAbout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {
        //Crea una nueva vista, que define la interfaz de usuario del elemento de la lista

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.about_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final  int position) {
        // Obtenga el elemento de su conjunto de datos en esta posición y reemplace el contenido de la vista con ese elemento
        viewHolder.getImg().setImageResource(datosAbout.get(position).getImg());
        viewHolder.getNombreTextView().setText(datosAbout.get(position).getNombre());
        viewHolder.getAnyo().setText(datosAbout.get(position).getAnyo());

        ItemAbout item = datosAbout.get(position);
        viewHolder.nombreTextView.setText(item.getNombre());
        viewHolder.anyo.setText(item.getAnyo());
        viewHolder.img.setImageResource(item.getImg());

    }

    @Override
    public int getItemCount() {
        return datosAbout.size();
    }

}
