package produto;

public class Bebida extends Produto {

    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Bebida: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
