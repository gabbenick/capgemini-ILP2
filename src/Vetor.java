import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

    private Scanner scanner;

    public Vetor(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Reverso() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosReversos = new ArrayList<Integer>();

        System.out.println("Insira 10 números.");
        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
        }

        System.out.println("Agora os números estão invertidos");
        for (int i = 9; i >= 0; i--) {
            numerosReversos.add(numeros.get(i));
        }

        System.out.println(Arrays.toString(numeros.toArray()));
        System.out.println(Arrays.toString(numerosReversos.toArray()));
    }

}
