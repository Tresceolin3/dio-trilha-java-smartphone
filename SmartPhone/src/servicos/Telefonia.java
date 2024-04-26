package servicos;

public interface Telefonia {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
}
