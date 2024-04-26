package entidades;

public class Aplicativos {
    private String nome_appString;

    public void instalarAplicativo() {
        
        System.out.println("Instalando aplicativo: " + nome_appString);
    }

    public void desinstalarAplicativo() {
     
        System.out.println("Desinstalando aplicativo: " + nome_appString);
    }

    public void executarAplicativo() {
        System.out.println("Executando aplicativo: " + nome_appString);
    }

    public String getNome_appString() {
        return nome_appString;
    }

    public void setNome_appString(String nome_appString) {
        this.nome_appString = nome_appString;
    }

}
