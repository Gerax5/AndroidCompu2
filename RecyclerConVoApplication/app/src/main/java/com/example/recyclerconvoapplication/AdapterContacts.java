package com.example.recyclerconvoapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterContacts extends RecyclerView.Adapter<AdapterContacts.ViewHolder> {

    ArrayList<ContactosVo> list = new ArrayList<>();

    public AdapterContacts(ArrayList<ContactosVo> list){
        this.list = list;
    }

    @Override
    public AdapterContacts.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacto,parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterContacts.ViewHolder holder, int position) {
        holder.render(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre;
        TextView apellido;
        TextView telefono;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tv_nombre_contacto);
            apellido = itemView.findViewById(R.id.tv_apellido_contacto);
            telefono = itemView.findViewById(R.id.tv_telefono_contacto);
            img = itemView.findViewById(R.id.imv_contactos);
        }

        public void render(ContactosVo cvo){
            nombre.setText(String.valueOf(cvo.getNombre()));
            apellido.setText(String.valueOf(cvo.getApellido()));
            telefono.setText(String.valueOf(cvo.getTelefono()));
            img.setImageResource(cvo.getImagen());
        }

    }
}
