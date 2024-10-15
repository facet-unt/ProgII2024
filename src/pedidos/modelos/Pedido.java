package pedidos.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private Estado estado;
    private LocalDateTime fechaYHora;
    private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();
    
    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList productosdelpedido, Cliente cliente, Estado estado) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.estado = estado;
        this.productosDelPedido = productosdelpedido;
    }
    
    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList productosdelpedido, Cliente cliente) {
        this(numero, fechaYHora, productosdelpedido,cliente, Estado.PROCESANDO);
    }
    
    public void mostrar() {
        System.out.println("Nro: " + numero);
        System.out.println("Fecha: " + fechaYHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\tHora: " + fechaYHora.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("Cliente: " + cliente.verApellido() + ", " + cliente.verNombre());
        System.out.println("Estado: " + estado.toString());
        System.out.println("========================");
        System.out.println("Producto\tCantidad");
        System.out.println("========================");
        for(ProductoDelPedido pdp : this.productosDelPedido) {
            pdp.mostrar();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
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
    
    public void agregarProducto(Producto Producto, int cantidad) {
        for(ProductoDelPedido pdp : productosDelPedido)
        {
            if(!pdp.verProducto().equals(Producto))
                productosDelPedido.add(pdp);
        }
    }
    
    public ArrayList<ProductoDelPedido> verProductos() {
        return this.productosDelPedido;
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Cliente verCliente() {
        return cliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDateTime verFechaYHora() {
        return fechaYHora;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

}
