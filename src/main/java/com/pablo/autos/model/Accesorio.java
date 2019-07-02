package com.pablo.autos.model;

import javax.persistence.*;

@Entity
@Table(name = "accesorios")
public class Accesorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String precioUnitario;
    private String cantidad;

    public Accesorio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
