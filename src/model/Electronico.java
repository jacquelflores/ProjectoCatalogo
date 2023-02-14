package model;

import interfaces.InterfaceElectronico;

public abstract class Electronico extends Producto implements InterfaceElectronico {

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

}
