package notificacao;

public class Email implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
