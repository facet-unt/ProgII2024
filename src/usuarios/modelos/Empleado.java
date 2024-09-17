package usuarios.modelos;

public class Empleado {
    public String Correo;
    public String Clave;
    public String Apellido;
    public String Nombre="Leonel";
        
        void mostrar(){
           System.out.println(Nombre);
    }
    @Override
    public String toString() {
        return "Empleado {" + "Nombre=" + Nombre + '}';
    }
}
