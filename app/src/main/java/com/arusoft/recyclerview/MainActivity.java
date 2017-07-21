package com.arusoft.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.lista);
        LinearLayoutManager llm= new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        List<Jugador> listaJugador = Arrays.asList( new Jugador(R.mipmap.ic_launcher, "CR7"),
                                                    new Jugador(R.mipmap.ic_launcher, "ABCDEFG"));

        Adaptador adaptador = new Adaptador(listaJugador);
        rv.setAdapter(adaptador);
    }
}
