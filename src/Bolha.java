import java.util.ArrayList;
import java.util.Scanner;

public class Bolha {
    private Scanner scanner;

    public Bolha(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ForLoop() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int aux;

        System.out.println("Insira 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros.get(j) > numeros.get(i)) {
                    aux = numeros.get(i);
                    numeros.add(numeros.get(j));
                    numeros.set(j, aux);
                }
            }
        }
    }
}
