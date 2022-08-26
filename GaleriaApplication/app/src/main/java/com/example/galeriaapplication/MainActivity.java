package com.example.galeriaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.galeriaapplication.databinding.ActivityMainBinding;
import com.example.galeriaapplication.databinding.ActivityVistaArteBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        AdapterPrincipalList adapterPrincipalList = new AdapterPrincipalList(this, R.layout.item_categoria,imagenesCategoria(), nombreCategoria());
        binding.listCategorias.setAdapter(adapterPrincipalList);


        binding.listCategorias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), VistaArteActivity.class);
                if(i == 0){
                    intent.putExtra("nombreCat","Arte Abstracto");
                    intent.putExtra("nombreArte", nAbstractas());
                    intent.putExtra("precioArte", pAbstracto());
                    intent.putExtra("descArte", desAbstracto());
                    intent.putExtra("img", imgAbstracto());
                }
                if(i == 1){
                    intent.putExtra("nombreCat","Arte Cubismo");
                    intent.putExtra("nombreArte", nCubismo());
                    intent.putExtra("precioArte", pCubismo());
                    intent.putExtra("descArte", desCubismo());
                    intent.putExtra("img", imgCubismo());
                }
                if(i == 2){
                    intent.putExtra("nombreCat","Arte Fotorealismo");
                    intent.putExtra("nombreArte", nFotorealista());
                    intent.putExtra("precioArte", pFotorealista());
                    intent.putExtra("descArte", desFotorealista());
                    intent.putExtra("img", imgFotorealista());
                }
                if(i == 3){
                    intent.putExtra("nombreCat","Arte Realismo");
                    intent.putExtra("nombreArte", nRealismo());
                    intent.putExtra("precioArte", pRealismo());
                    intent.putExtra("descArte", desRealismo());
                    intent.putExtra("img", imgRealismo());
                }
                startActivity(intent);
            }
        });
    }

    private ArrayList<String> nRealismo(){
        ArrayList<String> n = new ArrayList<>();
        n.add("Retrato de la madre del artista");
        return n;
    }

    private ArrayList<String> desRealismo(){
        ArrayList<String> d = new ArrayList<>();
        d.add("James McNeill Whistler, 1871, Oleo sobre lienzo");
        return  d;
    }

    private ArrayList<String> pRealismo(){
        ArrayList<String> p = new ArrayList<>();
        p.add("45000.00");
        return p;
    }

    private ArrayList<Integer> imgRealismo(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_realismo_madre);
        return img;
    }



    private ArrayList<String> nFotorealista(){
        ArrayList<String> n = new ArrayList<>();
        n.add("The Ultimate Gumball");
        n.add("Farb Family Portrait");
        return n;
    }

    private ArrayList<String> desFotorealista(){
        ArrayList<String> d = new ArrayList<>();
        d.add("Charles Bell, 1978");
        d.add("Audrey Flack, Retrato, 1970");
        return  d;
    }

    private ArrayList<String> pFotorealista(){
        ArrayList<String> p = new ArrayList<>();
        p.add("125000.00");
        p.add("50000.00");
        return p;
    }

    private ArrayList<Integer> imgFotorealista(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_fotorealista_ultimate_gumball);
        img.add(R.drawable.ic_fotorealista_farb_family);
        return img;
    }



    private ArrayList<String> nCubismo(){
        ArrayList<String> n = new ArrayList<>();
        n.add("Mujer con mandolina");
        n.add("Mujer frente al espejo");
        n.add("Retrato de Picasso");
        n.add("Las señoritas de Avignon");
        return n;
    }

    private ArrayList<String> desCubismo(){
        ArrayList<String> d = new ArrayList<>();
        d.add("Pablo Picasso, 1937–1910, Pintura al óleo");
        d.add("Pablo Picasso, 1932, Oleo sobre lienzo");
        d.add("Juan Gris, 1912, oleo");
        d.add("Pablo Picasso, 1907, Oleo sobre lienzo");
        return  d;
    }

    private ArrayList<String> pCubismo(){
        ArrayList<String> p = new ArrayList<>();
        p.add("111515000.00");
        p.add("1251253.00");
        p.add("500100.00");
        p.add("999999.99");
        return p;
    }

    private ArrayList<Integer> imgCubismo(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_cubismo_mujer_ma);
        img.add(R.drawable.ic_cubismo_mujer_espejo);
        img.add(R.drawable.ic_cubismo_picasso);
        img.add(R.drawable.ic_cubismo_las_senoritas);
        return img;
    }

    private ArrayList<String> nAbstractas(){
        ArrayList<String> n = new ArrayList<>();
        n.add("EDAD ADULTA");
        n.add("CUADRADO NEGRO");
        return n;
    }

    private ArrayList<String> desAbstracto(){
        ArrayList<String> d = new ArrayList<>();
        d.add("HILMA AF KLINT, NUM. 7, 1907");
        d.add("kAZIMIR MALEVICH, 1915");
        return  d;
    }

    private ArrayList<String> pAbstracto(){
        ArrayList<String> p = new ArrayList<>();
        p.add("315000.00");
        p.add("514739.99");
        return p;
    }

    private ArrayList<Integer> imgAbstracto(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_abs_edad_adulta);
        img.add(R.drawable.ic_abs_cuadrado_negro);
        return img;
    }

    private ArrayList<Integer> imagenesCategoria(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_abstracto);
        img.add(R.drawable.ic_cubismo);
        img.add(R.drawable.ic_fotorrealista);
        img.add(R.drawable.ic_realismo);
        return img;
    }

    private ArrayList<String> nombreCategoria(){
        ArrayList<String> categoria = new ArrayList<>();
        categoria.add("Abstracto");
        categoria.add("Cubismo");
        categoria.add("Fotorealista");
        categoria.add("Realismo");
        return categoria;
    }
}