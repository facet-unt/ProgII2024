package lib;

import productos.modelos.Producto;

public class Main {
    public static void main(String[] args) {
        Producto unProducto = new Producto();
        unProducto.mostrar();
        unProducto.Nombre = "Pizza";
        unProducto.Precio = 35.50f;
        unProducto.mostrar();
    }
}
