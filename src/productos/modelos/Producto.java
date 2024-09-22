package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    private int Codigo;
    private String Nombre = "Arroz";
    private String Descripcion="Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    private String Categoria;
    private String Estado="Disponible";
    private float Precio=3.5f;

    public void mostrar() {
        System.out.println(Nombre);
        System.out.println(Precio);
    }

    @Override
    public String toString() {
        return "Producto {" + "Nombre=" + Nombre + "; Descripcion=" + Descripcion + '}';
    }
    public Producto(int Codigo, String Nombre, String Categoria, String Estado, float Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Estado = Estado;
        this.Precio = Precio;
    }
       
}




