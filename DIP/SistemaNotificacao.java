package notificacao;

public class SistemaNotificacao {
    private Notificador notificador;

    public SistemaNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensagem) {
        notificador.enviar(mensagem);
    }
}
