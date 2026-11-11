import pedido.*;
import pagamento.*;
import produto.*;
import notificacao.*;
import interfaces.*;

public class Main {

    public static void main(String[] args) {

        // SRP
        PedidoRepository repository = new PedidoRepository();
        PedidoService service = new PedidoService(repository);
        PedidoExibidor exibidor = new PedidoExibidor();

        Pedido pedido = service.criarPedido(
                1, "Carlos", "Pizza de Calabresa", 45.00
        );

        exibidor.exibir(pedido);

        // OCP
        Pagamento pagamento = new PagamentoPix();
        pagamento.pagar(pedido.getValor());

        // LSP
        Produto pizza = new Pizza("Pizza de Calabresa", 45.00);
        Produto hamburguer = new Hamburguer("X-Burger", 25.00);
        Produto bebida = new Bebida("Refrigerante", 8.00);

        pizza.exibirInformacoes();
        hamburguer.exibirInformacoes();
        bebida.exibirInformacoes();

        // ISP
        Restaurante restaurante = new Restaurante();
        Entregador entregador = new Entregador();

        restaurante.criarPedido();
        restaurante.gerarRelatorio();

        entregador.iniciarEntrega();
        entregador.finalizarEntrega();

        // DIP
        SistemaNotificacao sistema =
                new SistemaNotificacao(new WhatsApp());

        sistema.notificar("Seu pedido foi confirmado!");
    }
}
