package com.arusoft.recyclerview;

/**
 * Created by Saelthas on 8/6/2017.
 */

public class Jugador {
    private int foto;
    private String nombre;

    public Jugador(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
