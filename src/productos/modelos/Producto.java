package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public int Codigo;
    public String Nombre = "Arroz";
    public String Descripcion="Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    public String Categoria;
    public String Estado="Disponible";
    public float Precio=3.5f;

    public void mostrar() {
        System.out.println(Nombre);
        System.out.println(Precio);
    }

    @Override
    public String toString() {
        return "Producto {" + "Nombre=" + Nombre + "; Descripcion=" + Descripcion + '}';
    }
       
}




