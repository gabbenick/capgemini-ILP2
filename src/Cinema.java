import java.util.Scanner;

public class Cinema {
    private Scanner scanner;

    public Cinema(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Array() {
        String[][] cinema = new String[9][9];
        String opcao;
        int fila;
        int poltrona;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cinema[i][j] = "0";
            }
        }

        do {
            System.out.println("1 - Reservar");
            System.out.println("2 - Layour do Cinema");
            System.out.println("3 - Sair");

            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Fila");
                    fila = scanner.nextInt();
                    System.out.println("Poltrona");
                    poltrona = scanner.nextInt();

                    if (cinema[fila][poltrona] == "0") {
                        cinema[fila][poltrona] = "X";
                    } else {
                        System.out.println("Poltrona ocupada.");
                    }
                case "2":
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print(cinema[i][j] + " ");
                        }
                        System.out.println();
                    }
            }
        } while (opcao != "3");
    }
}
