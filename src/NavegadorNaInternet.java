public class NavegadorNaInternet {

    int pagina =0;

    public void exibirPagina(){
        System.out.println("Pagina "+ pagina);
    }
    public void adicionarNovaAba(){
        pagina++;
        System.out.println("Pagina " + pagina + " Adicionada");
    }
    public void atualizarPagina(){
        System.out.println("Pagina "+pagina+ " Atualizada");
    }
}
