package pedido;

public class PedidoService {
    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public void criarPedido(int id, String cliente, String produto, double valor) {
        Pedido pedido = new Pedido(id, cliente, produto, valor);
        repository.salvar(pedido);
    }

    public void exibirPedido(Pedido pedido) {
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produto: " + pedido.getProduto());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}
