package com.example.recyclerconvoapplication;

public class ContactosVo {
    private int imagen;
    private String nombre;
    private String apellido;
    private String telefono;

    public ContactosVo(int imagen, String nombre, String apellido, String telefono) {
       this.imagen = imagen;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
