package usuarios.modelos;

public class Cliente {

    String correo;
    String clave;
    String apellido;
    String nombre;

    public void mostrar() {
        System.out.println(" " + correo + " " + clave + " " + apellido + " " + nombre);
    }
}
