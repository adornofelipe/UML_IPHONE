public class Iphone {
    public static void main(String[] args) {

        NavegadorNaInternet safari = new NavegadorNaInternet();
        AparelhoTelefonico iphone11 = new AparelhoTelefonico();
        ReprodutorMusical musical = new ReprodutorMusical();
        musical.tocar();
        musical.pausar();
        iphone11.atender();
        iphone11.ligar();
        iphone11.iniciarCorreioVoz();
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.exibirPagina();
        safari.atualizarPagina();
        safari.exibirPagina();
        safari.adicionarNovaAba();


    }


}