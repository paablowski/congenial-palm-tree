package com.pablo.autos.model;

import javax.persistence.*;

@Entity
@Table(name = "vendedores")
public class Vendedor {

    @Id
    @Column(nullable = false)
    private String rut;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;
    private String genero;
    private String telefono;
    private String email;
    private String fechaInicioContrato;
    private String cargo;
    private String rentaLiquidaMensual;


    public Vendedor() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRentaLiquidaMensual() {
        return rentaLiquidaMensual;
    }

    public void setRentaLiquidaMensual(String rentaLiquidaMensual) {
        this.rentaLiquidaMensual = rentaLiquidaMensual;
    }
}
