/*
 * Copyright (c) 2024, Lucas Ahumada Checa   &   Juan Pablo Rearte
 * Todos los derechos reservados.
 *
 * Este código es propiedad de [Lucas Ahumada Checa   &   Juan Pablo Rearte] y no puede ser utilizado
 * sin permiso explícito.
 */
package productos.modelos;

/**
 *
 * @author juamp
 */
public enum Estado {
    DISPONIBLE("disponible"), NO_DISPONIBLE("no disponible");
    private String valor;

    private Estado(String valor) {
        this.valor = valor;
    }

    @Override

    public String toString() {
        switch (this) {
            case DISPONIBLE:
                return "Disponible";
            case NO_DISPONIBLE:
                return "No Disponible";
            default:
                return super.toString();
        }
    }
}
