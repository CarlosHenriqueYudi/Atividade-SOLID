package interfaces;

public class Restaurante implements GerenciadorPedidos, Relatorio {

    @Override
    public void criarPedido() {
        System.out.println("Pedido criado!");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido cancelado!");
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de pedidos gerado!");
    }
}
