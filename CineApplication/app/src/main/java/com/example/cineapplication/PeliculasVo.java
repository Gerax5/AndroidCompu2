package com.example.cineapplication;

public class PeliculasVo {
    private String nombre;
    private String duracion;
    private double precio;
    private int sinopsis;
    private int directorYActores;
    private int puntuacionyRecaudacion;
    private int imagen;

    public PeliculasVo(String nombre, String duracion, double precio, int sinopsis, int directorYActores, int puntuacionyRecaudacion, int imagen) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.directorYActores = directorYActores;
        this.puntuacionyRecaudacion = puntuacionyRecaudacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(int sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDirectorYActores() {
        return directorYActores;
    }

    public void setDirectorYActores(int directorYActores) {
        this.directorYActores = directorYActores;
    }

    public int getPuntuacionyRecaudacion() {
        return puntuacionyRecaudacion;
    }

    public void setPuntuacionyRecaudacion(int puntuacionyRecaudacion) {
        this.puntuacionyRecaudacion = puntuacionyRecaudacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
