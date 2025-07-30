public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Auto-reverse - O Rappa");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("21693256146");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.youtube.com/watch?v=vgZwa7GKRCA&list=RDvgZwa7GKRCA&start_radio=1");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
