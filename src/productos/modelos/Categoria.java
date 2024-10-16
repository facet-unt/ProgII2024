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
public enum Categoria {
    ENTRADA,
    PLATO_PRINCIPAL,
    POSTRE;

    @Override
    public String toString() {
        switch (this) {
            case ENTRADA:
                return "Entrada";
            case PLATO_PRINCIPAL:
                return "Plato Principal";
            case POSTRE:
                return "Postre";
            default:
                return super.toString();
        }
    }
}
