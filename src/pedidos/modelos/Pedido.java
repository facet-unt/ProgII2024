/*
 * Copyright (c) 2024, Lucas Ahumada Checa   &   Juan Pablo Rearte
 * Todos los derechos reservados.
 *
 * Este código es propiedad de [Lucas Ahumada Checa   &   Juan Pablo Rearte] y no puede ser utilizado
 * sin permiso explícito.
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author luis
 */
public class Pedido {

    private int numero;
    private Cliente unCliente;
    private LocalDateTime fechaYHora;
    private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();
    private Estado estado;

    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
        this.productosDelPedido = productosDelPedido;
        estado = Estado.CREADO;
    }

    public void agregarProducto(Producto unProducto, int cantidad) {
        ProductoDelPedido p = new ProductoDelPedido(unProducto, cantidad);

        if (!productosDelPedido.contains(p)) {
            productosDelPedido.add(p);
        }

    }

    public void mostrar() {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fechaYHora.format(formateador);
        System.out.println("=====================");
        System.out.println("Número de pedido: " + numero);
        System.out.println();
        System.out.println("Fecha y hora: " + fechaHoraFormateada);
        System.out.println();
        System.out.println("Cliente: " + unCliente.verNombre() + " " + unCliente.verApellido());
        System.out.println();
        System.out.println("Estado: " + estado);
        System.out.println();

        System.out.println("Productos:      Cantidad: ");
        for (ProductoDelPedido p : productosDelPedido) {
            System.out.println(p.verProducto().verDescripcion() + "           " + p.verCantidad());
        }
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<ProductoDelPedido> verProductosDelPedido() {
        return productosDelPedido;
    }

    public void asignarProductosDelPedido(ArrayList<ProductoDelPedido> productosDelPedido) {
        this.productosDelPedido = productosDelPedido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numero;
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
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }

}
