import java.util.Scanner;

public class CacaMain {

    private CacaPalavras palavras;
    private CacaMapa mapa;


    private CacaMain() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("____ Menu: Caça Palavras ____");
        System.out.println("1. listar palavras");
        System.out.println("2. listar mapa");
        System.out.println("3. listar respostas");
        System.out.println("4. sair");
        System.out.println(" __ opção:");
        int opcao = teclado.nextInt();

        do {
            switch (opcao) {
                case 1:

                    break;
            
                default:
                    System.out.println("opção errada!");
                    break;
            }
            System.out.println("____ Menu: Caça Palavras ____");
            System.out.println("1. listar palavras");
            System.out.println("2. listar mapa");
            System.out.println("3. listar respostas");
            System.out.println("4. sair");
            System.out.println(" __ opção:");
            opcao = teclado.nextInt();
        } while (opcao != 4);
        
        teclado.close();
    }






    public static void main(String[] args) {
        new CacaMain();
    }
}
