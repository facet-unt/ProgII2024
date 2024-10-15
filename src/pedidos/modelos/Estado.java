package pedidos.modelos;

public enum Estado {
    CREADO("Creado"),
    SOLICITADO("Solicitado"),
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
