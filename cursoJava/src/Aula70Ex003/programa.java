package Aula70Ex003;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        estudante estudante = new estudante();
        String nome = sc.nextLine();

        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f", estudante.calculoNota());
        System.out.println();
        estudante.calculoMedia();

    }
}
