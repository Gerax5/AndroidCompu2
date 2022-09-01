package com.example.recyclerjavaapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder> {

    ArrayList<Integer> img = new ArrayList<>();
    ArrayList<String> nom = new ArrayList<>();

    public AdapterRecycler(ArrayList<Integer> img,ArrayList<String> nom){
        this.img = img;
        this.nom = nom;
    }

    @Override
    public AdapterRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagenes, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycler.ViewHolder holder, int position) {
        holder.render(nom.get(position), img.get(position));
    }

    @Override
    public int getItemCount() {
        return this.img.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_rv_main);
            imageView = itemView.findViewById(R.id.img_rv_main);
        }

        public void render(String texto, Integer img){
            textView.setText(String.valueOf(texto));
            imageView.setImageResource(img);
        }
    }
}
