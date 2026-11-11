package pedido;

public class Pedido {
    private int id;
    private String cliente;
    private String produto;
    private double valor;

    public Pedido(int id, String cliente, String produto, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }
}
