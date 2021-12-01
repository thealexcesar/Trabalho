import java.util.Scanner;

public class CacaMain {

    // private CacaPalavras palavras;
    // private CacaMapa mapa;

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
                    // palavras.imprimir();
                    break;
                case 2:
                    // mapa.imprimir();
                    break;
                case 3:
                    // palavras.respostas();
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
        
        // CacaPalavras palavras = new CacaPalavras();
        // CacaMapa mapa = new CacaMapa();
        // palavras.imprimir(); // fixme: teste de compilacaco
        // mapa.pesquisa();
        
        teclado.close();
    }
    public static void main(String[] args) {
        new CacaMain();
    }
}
