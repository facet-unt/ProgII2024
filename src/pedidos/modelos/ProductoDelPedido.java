/*
 * Copyright (c) 2024, Lucas Ahumada Checa   &   Juan Pablo Rearte
 * Todos los derechos reservados.
 *
 * Este código es propiedad de [Lucas Ahumada Checa   &   Juan Pablo Rearte] y no puede ser utilizado
 * sin permiso explícito.
 */
package pedidos.modelos;

import java.util.Objects;
import productos.modelos.Producto;

public class ProductoDelPedido {
    private Producto unProducto;
    private int cantidad ;

    public ProductoDelPedido(Producto unProducto, int cantidad) {
        this.unProducto = unProducto;
        this.cantidad = cantidad;
    }

    public Producto verProducto() {
        return unProducto;
    }

    public void asignarProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public int verCantidad() {
        return cantidad;
    }

    public void asignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.unProducto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDelPedido other = (ProductoDelPedido) obj;
        return Objects.equals(this.unProducto, other.unProducto);
    }
    
    
    
    
}