package com.arusoft.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Saelthas on 8/6/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.JugadorViewHolder> {

    List<Jugador> listaJugador;

    public Adaptador(List<Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

    @Override
    public JugadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        JugadorViewHolder holder= new JugadorViewHolder(vista);

        return holder;
    }

    @Override
    public void onBindViewHolder(JugadorViewHolder holder, int position) {
        //establecer los valores de la vista
        holder.imgJugador.setImageResource(listaJugador.get(position).getFoto());
        holder.txtJugador.setText(listaJugador.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return listaJugador.size();
    }

    public static class JugadorViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView imgJugador;
        TextView txtJugador;
        public JugadorViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imgJugador = (ImageView) itemView.findViewById(R.id.imgJugador);
            txtJugador = (TextView) itemView.findViewById(R.id.txtJugador);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),"Click", Toast.LENGTH_SHORT).show();
        }
    }
}
