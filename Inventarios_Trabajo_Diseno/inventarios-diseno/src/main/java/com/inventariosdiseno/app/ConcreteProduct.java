package com.inventariosdiseno.app;

import java.util.List;

public class ConcreteProduct implements Producto {
    private int ID;
    private String nombre;
    private int stock;
    private List<Observer> observadores;

    public int getID() { return ID; }
    public String getNombre() { return nombre; }
    public int getStock() { return stock; }
    public int getPrecioVenta() { return 0; }
    public int getPrecioCompra() { return 0; }
    public void ActualizarStock(int cantidad) {}
    public void Suministrar() {}
}
