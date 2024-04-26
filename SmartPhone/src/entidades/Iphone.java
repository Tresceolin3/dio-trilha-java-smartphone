package entidades;

import servicos.Camera;
import servicos.Mensagens;
import servicos.Navegador;
import servicos.ReprodutorMusical;
import servicos.Telefonia;

public class Iphone implements ReprodutorMusical, Telefonia, Navegador, Camera, Mensagens {

    private String modelo;
    private String versaoSo;
    private String numeroSerie;
    private int bateria;
    private Aplicativos aplicativos;

    public Iphone(String modelo, String versaoSo, String numeroSerie, int bateria) {
        this.modelo = modelo;
        this.versaoSo = versaoSo;
        this.numeroSerie = numeroSerie;
        this.bateria = bateria;
        this.aplicativos = new Aplicativos();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersaoSo() {
        return versaoSo;
    }

    public void setVersaoSo(String versaoSo) {
        this.versaoSo = versaoSo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("iPhone está ligando...");
    }

    public void desligar() {
        System.out.println("iPhone está desligando...");
    }

    public void reiniciar() {
        System.out.println("iPhone está reiniciando...");
    }

    public void nivelBateria() {
        System.out.println("Nível de bateria: " + getBateria() + "%");
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Ajustando volume para: " + volume);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void abrirUrl(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fazerBusca(String busca) {
        System.out.println("Fazendo busca por: " + busca);
    }

    // Implementação dos métodos da interface Camera
    @Override
    public void capturarFoto() {
        System.out.println("Capturando foto...");
    }

    @Override
    public void gravarVideo() {
        System.out.println("Gravando vídeo...");
    }

    // Implementação dos métodos da interface Mensagens
    @Override
    public void enviarMensagemTexto(String contato, String mensagem) {
        System.out.println("Enviando mensagem de texto para: " + contato + "\nMensagem: " + mensagem);
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    // Métodos da classe Aplicativos
    public void instalarAplicativo(String nomeApp) {
        aplicativos.instalarAplicativo();
    }

    public void desinstalarAplicativo(String nomeApp) {
        aplicativos.desinstalarAplicativo();
    }

    public void executarAplicativo(String nomeApp) {
        aplicativos.executarAplicativo();
    }

}
