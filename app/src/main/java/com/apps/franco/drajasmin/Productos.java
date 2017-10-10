package com.apps.franco.drajasmin;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.apps.franco.drajasmin.R.array.Tratamientos;

public class Productos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        GridImagenAdapter adapter=new GridImagenAdapter(listar(),this);

        GridView grid=(GridView)findViewById(R.id.GridView);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intentPeeling=new Intent(getBaseContext(),Peeling.class);
                        startActivity(intentPeeling);
                        break;
                    case 1:
                        Intent inPlasma=new Intent(getBaseContext(),Plasma.class);
                        startActivity(inPlasma);
                        break;
                    case 2:
                        Intent inRenovacion=new Intent(getBaseContext(),Renovacion.class);
                        startActivity(inRenovacion);
                        break;
                    case 3:
                        Intent inLimpieza=new Intent(getBaseContext(),Limpieza.class);
                        startActivity(inLimpieza);
                        break;
                    case 4:
                        Intent Hibraderma =new Intent(getBaseContext(),Hibraderma.class);
                        startActivity(Hibraderma);
                }

            }
        });

    }

    private ArrayList<Imagenes> listar(){
        String [] tratamiento= getResources().getStringArray(R.array.Tratamientos);
        TypedArray imagen=getResources().obtainTypedArray(R.array.Imagenes);

        ArrayList<Imagenes> lista= new ArrayList<>();

        for(int i=0;i<tratamiento.length;i++){
            lista.add(new Imagenes(imagen.getResourceId(i,0),tratamiento[i]));
        }

        return lista;
    }

}
