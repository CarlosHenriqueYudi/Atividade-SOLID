package produto;

public class Hamburguer extends Produto {

    public Hamburguer(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Hambúrguer: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
