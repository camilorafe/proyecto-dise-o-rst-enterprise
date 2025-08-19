package com.inventariosdiseno.app;

public interface Producto {
    int getID();
    String getNombre();
    int getStock();
    int getPrecioVenta();
    int getPrecioCompra();
    void ActualizarStock(int cantidad);
}
