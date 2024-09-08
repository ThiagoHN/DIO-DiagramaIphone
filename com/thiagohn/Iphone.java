package thiagohn;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("OUVINDO MENSAGENS NO CORREIO DE VOZ");
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("MUSICA " + musica + " SELECIONADA");
    }

}