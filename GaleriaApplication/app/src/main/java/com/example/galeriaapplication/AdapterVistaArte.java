package com.example.galeriaapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterVistaArte extends BaseAdapter {

    private Context context;
    private int referenceList;
    ArrayList<String> nombre = new ArrayList<>();
    ArrayList<Integer> img = new ArrayList<>();
    ArrayList<String> precio = new ArrayList<>();
    ArrayList<String> desc = new ArrayList<>();

    public AdapterVistaArte(Context context, int referenceList, ArrayList<String> nombre, ArrayList<Integer> img,  ArrayList<String> precio, ArrayList<String> desc){
        this.context = context;
        this.referenceList = referenceList;
        this.nombre = nombre;
        this.img = img;
        this.precio = precio;
        this.desc = desc;
    }

    @Override
    public int getCount() {
        return this.nombre.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.item_vista_pintura, null);

        ImageView imv = v.findViewById(R.id.imv_vista_pintura);
        TextView tnombre = v.findViewById(R.id.tv_nombre_vista_pintura);
        TextView tprecio = v.findViewById(R.id.tv_precio_vista_pintura);
        TextView desc = v.findViewById(R.id.tv_descripcion_vista_pintura);
        Button button = v.findViewById(R.id.btn_adquirir_pintura);

        imv.setImageResource(this.img.get(i));
        tnombre.setText(String.valueOf(this.nombre.get(i)));
        tprecio.setText(String.valueOf("$ "+this.precio.get(i)));
        desc.setText(String.valueOf(this.desc.get(i)));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trasladar(img.get(i), nombre.get(i), precio.get(i));
            }
        });

        return v;
    }

    public void trasladar(int img, String nom, String precio){
        Intent intent = new Intent(context, VerSeleccionActivity.class);
        intent.putExtra("img",img);
        intent.putExtra("nom",nom);
        intent.putExtra("pre",precio);
        context.startActivity(intent);
    }
}
