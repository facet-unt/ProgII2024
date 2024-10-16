package pedidos.modelos;


public enum Estado {
    CREADO("Creado"),
    PROCESANDO("Procesando"),
    ENTREGADO("Entregado");
    
    private String valor;
    
    private Estado (String valor)
    {
        this.valor = valor;
    }
    
    @Override
    public String toString()
    {
        return valor;
    }
}