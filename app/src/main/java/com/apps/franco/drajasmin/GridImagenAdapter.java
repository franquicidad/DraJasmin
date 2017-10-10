package com.apps.franco.drajasmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Franco on 6/07/17.
 */

public class GridImagenAdapter extends BaseAdapter {

    private ArrayList<Imagenes> tratamientos;
    private Context context;

    public GridImagenAdapter(ArrayList<Imagenes> tratamientos, Context context) {
        this.tratamientos = tratamientos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return tratamientos.size();
    }

    @Override
    public Imagenes getItem(int position) {
        return tratamientos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imagenLay=LayoutInflater.from(parent.getContext());
        View view=convertView;
        if(convertView==null){
            view=imagenLay.inflate(R.layout.activity_info,null);
        }

        TextView textoTratamientos=(TextView)view.findViewById(R.id.desProducto);
        textoTratamientos.setText(getItem(position).getTratamiento());

        ImageView imagenTratamiento=(ImageView)view.findViewById(R.id.imagenProducto);
        imagenTratamiento.setImageResource(getItem(position).getImagen());

        return view;
    }
}
