import java.util.ArrayList;
import java.util.Scanner;

public class Operacao {
    private Scanner scanner;

    public Operacao(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Basica() {
        ArrayList<Integer> numeros1 = new ArrayList<Integer>();
        ArrayList<Integer> numeros2 = new ArrayList<Integer>();
        ArrayList<Integer> numerosResultado = new ArrayList<Integer>();
        int opcao;

        System.out.println("Insira 5 números no Array 1:");
        for (int i = 0; i < 5; i++) {
            numeros1.add(scanner.nextInt());
        }
        System.out.println("Insira 5 números no Array 2:");
        for (int i = 0; i < 5; i++) {
            numeros2.add(scanner.nextInt());
        }

        System.out.println("1 - Soma, 2 - Subtração.");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            for (int i = 0; i < 5; i++) {
                int resultado = numeros1.get(i) + numeros2.get(i);
                numerosResultado.add(resultado);
            }
        } else if (opcao == 2) {
            for (int i = 0; i < 5; i++) {
                int resultado = numeros1.get(i) - numeros2.get(i);
                numerosResultado.add(resultado);
            }
        }

        System.out.println("Resultado:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numerosResultado.get(i));
        }
    }
}
