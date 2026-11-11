package produto;

public class Pizza extends Produto {

    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Pizza: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
