package com.inventariosdiseno.app;

public interface Cliente {
    void Registrar(Observer obs);
    void Eliminar(Observer obs);
    void Notificar();
}
