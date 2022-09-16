package com.example.cineapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCine extends RecyclerView.Adapter<AdapterCine.ViewHolder> {

    private static ClickListener clickListener;

    ArrayList<PeliculasVo> list = new ArrayList<>();

    public AdapterCine(ArrayList<PeliculasVo> list) {
        this.list = list;
    }

    @Override
    public AdapterCine.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cartelera, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCine.ViewHolder holder, int position) {
        holder.render(list.get(position).getImagen(),list.get(position).getNombre(),list.get(position).getDuracion());
    }

    @Override
    public int getItemCount() {return list.size();}




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView1, textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_item_cartelera);
            textView1 = itemView.findViewById(R.id.tv_nombre_pelicula);
            textView2 = itemView.findViewById(R.id.tv_duracion_pelicula);
            itemView.setOnClickListener(this);
        }
        public void render(int img, String nombre, String duracion){
            imageView.setImageResource(img);
            textView1.setText(nombre);
            textView2.setText(duracion);
        }

        @Override
        public void onClick(View view) {
            clickListener.itemClick(getAdapterPosition(), view);
        }

    }

    public void setItemClickListener(ClickListener clickListener){
        AdapterCine.clickListener = clickListener;
    }
}
