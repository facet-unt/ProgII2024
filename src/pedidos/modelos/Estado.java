/*
 * Copyright (c) 2024, Lucas Ahumada Checa   &   Juan Pablo Rearte
 * Todos los derechos reservados.
 *
 * Este código es propiedad de [Lucas Ahumada Checa   &   Juan Pablo Rearte] y no puede ser utilizado
 * sin permiso explícito.
 */
package pedidos.modelos;

/**
 *
 * @author juamp
 */
public enum Estado {
    CREADO,
    SOLICITADO,
    PROCESANDO,
    ENTREGRADO;

    @Override
    public String toString() {
        switch (this) {
            case CREADO:
                return "Creado";
            case SOLICITADO:
                return "Solicitado";
            case PROCESANDO:
                return "Procesando";
            case ENTREGRADO:
                return "Entregado";
            default:
                return super.toString();
        }
    }
}
