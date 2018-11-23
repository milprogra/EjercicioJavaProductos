/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author mjara
 */
public class Venta {
    
    private int id;
    private String nombre;
    private Comprador comprador;
    private ArrayList<VentaDetalle> ventaDetalle;
    private int total;
    private int totalMasIva;

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public ArrayList<VentaDetalle> getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(ArrayList<VentaDetalle> ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalMasIva() {
        return totalMasIva;
    }

    public void setTotalMasIva(int totalMasIva) {
        this.totalMasIva = totalMasIva;
    }
    
    
}
