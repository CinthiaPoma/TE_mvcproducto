
package com.emergente.modelo;

public class Producto {
    private int id;
    private String descripcion;
    private int cantidad;
    private int precio;

    public Producto() {
        this.id=0;
        this.descripcion=" ";
        this.cantidad=0;
        this.precio=0;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
