import java.util.Scanner;

public class Cadastro {
    private Scanner scanner;

    public Cadastro(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Nome() {
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe nome para o cadastro: ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Informe nome para pesquisar: ");
        String pesquisa = scanner.nextLine();
        boolean encontrado;

        for (int i = 0; i < 5; i++) {
            if (nomes[i].equals(pesquisa)) {
                System.out.println("Nome encontrado na posição: " + (i + 1));
                encontrado = true;
                System.out.println(encontrado);
            } else {
                System.out.println("Nome não encontrado na posição: " + (i + 1));
                encontrado = false;
                System.out.println(encontrado);
            }

        }
    }
}
