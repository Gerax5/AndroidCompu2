package com.example.myapprecyclerviewvo;

public class DatosVO {
    private String nombreRestaurante;
    private String CalidadRestaurante;
    private int imagenRestaurante;

    public DatosVO(){

    }

    public DatosVO(String nombreRestaurante, String calidadRestaurante, int imagenRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        CalidadRestaurante = calidadRestaurante;
        this.imagenRestaurante = imagenRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getCalidadRestaurante() {
        return CalidadRestaurante;
    }

    public void setCalidadRestaurante(String calidadRestaurante) {
        CalidadRestaurante = calidadRestaurante;
    }

    public int getImagenRestaurante() {
        return imagenRestaurante;
    }

    public void setImagenRestaurante(int imagenRestaurante) {
        this.imagenRestaurante = imagenRestaurante;
    }
}
