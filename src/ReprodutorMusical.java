import java.util.Scanner;

public class ReprodutorMusical {

    public void tocar(){
        SelecionarMusica();
    }
    public void SelecionarMusica(){
        System.out.println("Digite um Numero Entre 1 e 3");
        int numero;
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
        if (numero == 1){
            System.out.println("Musica Selecionada. Castelos e ruinas: Sigo Na Sombra");
        } else if (numero ==2) {
            System.out.println("Musica Selecionada. Castelos e ruinas: Quadros");
        } else if (numero ==3) {
            System.out.println("Musica Selecionada. Castelos e ruinas: Caminhos");
        }
        else {
            System.out.println("Digite um Numero Entre 1 e 3");
        }
    }
    public void pausar(){
        System.out.println("Musica Pausada");
    }

}
