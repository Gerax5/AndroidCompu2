package com.example.gridcoloresapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.lang.ref.Reference;
import java.util.ArrayList;

public class AdapterColoresGrid extends BaseAdapter {

    private Context context;
    private int referenceGrid;
    private ArrayList<Integer> colores = new ArrayList<>();
    private ArrayList<String> hexa = new ArrayList<>();

    public AdapterColoresGrid(Context context, int referenceGrid, ArrayList<Integer> colores, ArrayList<String> hexa){
        this.colores = colores;
        this.context = context;
        this.referenceGrid = referenceGrid;
        this.hexa = hexa;
    }

    @Override
    public int getCount() {
        return this.colores.size();
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
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.item_cuadro_color, null);

        int c = colores.get(i);

        ImageView img = v.findViewById(R.id.imv_color);
        TextView textView = v.findViewById(R.id.tv_color);

        textView.setText(hexa.get(i));
        img.setImageResource(c);


        return v;
    }
}
