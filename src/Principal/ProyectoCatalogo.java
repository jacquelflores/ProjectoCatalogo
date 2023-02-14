package Principal;

import interfaces.InterfaceElectronico;
import interfaces.InterfaceLibro;
import interfaces.InterfacePorducto;
import model.*;

//autor : Jacqueline Flores Hurtado

public class ProyectoCatalogo {
    public static void main(String[] args) {

        InterfacePorducto[] productos = new Producto[6];

        productos[0] = new Iphone(299000, "Apple", "3G", "Negro");
        productos[1] = new Iphone(399000, "Apple", "4G", "Blanco");
        productos[2] = new TvLcd(340000, "Sony", 40);
        productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
        productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
        productos[5] = new Comics(5000, "Pepo", "Condorito", "Alguna...", "Condorito");

        for (InterfacePorducto producto : productos) {

            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            if (producto instanceof InterfaceElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((InterfaceElectronico) producto).getFabricante());

                if (producto instanceof Iphone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((Iphone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((Iphone) producto).getColor());
                }

                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            if (producto instanceof InterfaceLibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((InterfaceLibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((InterfaceLibro) producto).getAutor());

                if (producto instanceof Comics) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}
