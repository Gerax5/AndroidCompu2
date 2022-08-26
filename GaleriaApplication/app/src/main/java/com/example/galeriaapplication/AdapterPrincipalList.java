package com.example.galeriaapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPrincipalList extends BaseAdapter {

    private Context context;
    private int referenceList;
    ArrayList<Integer> imagen = new ArrayList<>();
    ArrayList<String>NombreCategoria = new ArrayList<>();

    public AdapterPrincipalList(Context context, int reference, ArrayList<Integer> imagen, ArrayList<String> nombreCategoria ){
        this.context = context;
        this.imagen = imagen;
        this.NombreCategoria = nombreCategoria;
        this.referenceList = reference;
    }

    @Override
    public int getCount() { return this.NombreCategoria.size(); }

    @Override
    public Object getItem(int i) { return null; }

    @Override
    public long getItemId(int i) {return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.item_categoria, null);

        int img = this.imagen.get(i);
        String nombredeCategoria = this.NombreCategoria.get(i);

        ImageView imageView = v.findViewById(R.id.imv_item_categoria);
        TextView textView = v.findViewById(R.id.tv_categoria);

        imageView.setImageResource(img);
        textView.setText(String.valueOf(nombredeCategoria));

        return v;
    }
}
