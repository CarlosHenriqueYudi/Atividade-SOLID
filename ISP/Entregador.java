package interfaces;

public class Entregador implements GerenciadorEntregas {

    @Override
    public void iniciarEntrega() {
        System.out.println("Entrega iniciada!");
    }

    @Override
    public void finalizarEntrega() {
        System.out.println("Entrega finalizada!");
    }
}
