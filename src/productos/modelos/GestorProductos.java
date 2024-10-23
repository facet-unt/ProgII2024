/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class GestorProductos {

    private static GestorProductos gestor;
    private ArrayList<Producto> productos;
    public static final String EXITO = "Producto creado/modificado con éxito";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";
    public static final String ERROR_ESTADO = "El Estado del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";

    private GestorProductos() {
        productos = new ArrayList<>(); //inicializacion de la lista.
    }

    public static GestorProductos crear() {
        if (gestor == null) {
            gestor = new GestorProductos();
        }
        return gestor;
    }

    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        String resultadoValidacion = this.validarProducto(codigo, descripcion, precio, categoria, estado);

        if (!resultadoValidacion.equals(VALIDACION_EXITO)) {
            return resultadoValidacion;
        } else {
            Producto unProducto = new Producto(codigo, descripcion, categoria, estado, precio);
            if (!productos.contains(unProducto)) {
                this.productos.add(unProducto);
                return EXITO;
            } else {
                return PRODUCTOS_DUPLICADOS;
            }
        }
    }

    public String validarProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        if (codigo <= 0) {
            return ERROR_CODIGO;
        }

        if (descripcion == null || descripcion.trim().isEmpty()) {
            return ERROR_DESCRIPCION;
        }
        if (precio <= 0) {
            return ERROR_PRECIO;
        }
        if (categoria == null) {
            return ERROR_CATEGORIA;
        }
        if (estado == null) {
            return ERROR_ESTADO;
        }
        return VALIDACION_EXITO;
    }

    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        String resultadoValidacion = this.validarProducto(codigo, descripcion, precio, categoria, estado);
        if (!resultadoValidacion.equals(VALIDACION_EXITO)) {
            return resultadoValidacion;
        } else {
            if (this.productos.contains(productoAModificar)) {
                productoAModificar.asignarDescripcion(descripcion);
                productoAModificar.asignarPrecio(precio);
                productoAModificar.asignarCategoria(categoria);
                productoAModificar.asignarEstado(estado);
                return EXITO;

            } else {
                return PRODUCTO_INEXISTENTE;
            }
        }
    }

    public ArrayList<Producto> menu() {
        return this.productos;
    }

    public ArrayList<Producto> buscarProductos(String descripcion) {
        ArrayList<Producto> productosEncontrado = new ArrayList<>();
        for (Producto p : productos) {
            String descripcionProducto = p.verDescripcion().toLowerCase();
            String descripcionBuscada = descripcion.toLowerCase();

            // Verificamos si la descripción del producto es igual o contiene la cadena buscada
            if (descripcionProducto.equals(descripcionBuscada) || descripcionProducto.contains(descripcionBuscada)) {
                productosEncontrado.add(p);
            }
        }
        return productosEncontrado;
    }

    public boolean existeEsteProducto(Producto producto) {
        return productos.contains(producto);
    }     // devuelve true si existe el producto especificado, false en caso contrario.

    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria) {

        ArrayList<Producto> productosPorCategoria = new ArrayList<>();

        for (Producto p : productos) {
            if (p.verCategoria().equals(categoria.toString())) {
                productosPorCategoria.add(p);
            }
        }

        return productosPorCategoria;
    }

    public Producto obtenerProducto(Integer codigo) {
        for (Producto p : productos) {
            if (p.verCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
}
