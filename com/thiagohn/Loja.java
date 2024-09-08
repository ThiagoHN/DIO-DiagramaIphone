package thiagohn;

public class Loja {
    
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();
    
        // Utilizando os serviços do app Chamada
        iphone.ligar("2342-3322");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Utilizando os serviços do app Safari
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.youtube.com");
        iphone.atualizarPagina();

        // Utilizando os serviço do app iPod
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Televison Rules the Nation");

    }

}