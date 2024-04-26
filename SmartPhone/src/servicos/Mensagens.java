package servicos;

public interface Mensagens {
    void enviarMensagemTexto(String contato, String mensagem);
    void receberMensagem();
}
