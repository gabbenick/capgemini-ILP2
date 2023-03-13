import java.util.Scanner;

public class Imprimir {
    private Scanner scanner;

    public Imprimir(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Nome() {
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um nome: ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }

    }
}
