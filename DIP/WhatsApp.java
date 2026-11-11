package notificacao;

public class WhatsApp implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
