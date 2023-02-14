package model;

import interfaces.InterfacePorducto;

public abstract class Producto implements InterfacePorducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
