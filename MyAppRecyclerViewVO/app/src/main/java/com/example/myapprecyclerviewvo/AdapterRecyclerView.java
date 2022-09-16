package com.example.myapprecyclerviewvo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapprecyclerviewvo.databinding.ItemComidaBinding;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {


    private ArrayList<DatosVO> listDatos = new ArrayList<>();
    
    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comida, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        holder.asignarDatos(listDatos.get(position).getNombreRestaurante(), listDatos.get(position).getCalidadRestaurante(), listDatos.get(position).getImagenRestaurante());
    }

    @Override
    public int getItemCount() {
        return this.listDatos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNombre, txtViewCalidad;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNombre = itemView.findViewById(R.id.tv_nombre);
            txtViewCalidad = itemView.findViewById(R.id.tv_calidad);
            imageView = itemView.findViewById(R.id.img_comida);
        }
        private void asignarDatos(String nombre, String calidad, Integer imagen){
            textViewNombre.setText(String.valueOf(nombre));
            txtViewCalidad.setText(String.valueOf(calidad));
            imageView.setImageResource(imagen);
        }
    }
}
