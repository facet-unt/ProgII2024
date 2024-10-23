package usuarios.modelos;

import pedidos.modelos.Pedido;
import java.util.ArrayList;

public class UsuariosConcretos extends Usuario {
    private Perfil perfil; // Suponiendo que 'Perfil' es una enumeración que definiste

    public UsuariosConcretos(String correo, String clave, String apellido, String nombre, Perfil perfil) {
        super(correo, clave, apellido, nombre);
        this.perfil = perfil;
    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        // Implementación para ver pedidos, puede ser vacía o concreta dependiendo de tu lógica
        return new ArrayList<>(); // Placeholder
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
