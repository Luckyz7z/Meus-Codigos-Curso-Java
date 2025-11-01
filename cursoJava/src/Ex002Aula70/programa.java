package Ex002Aula70;

import java.util.Locale;
import java.util.Scanner;

public class programa {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario fn = new funcionario();

        System.out.print("Nome: ");
        fn.nome = sc.nextLine();

        System.out.print("Salário liquido: ");
        fn.salario = sc.nextDouble();

        System.out.print("Taxa: ");
        fn.taxa = sc.nextDouble();
        System.out.println();

        System.out.print("Funcionário: " + fn.nome);
        System.out.printf(", $%.2f", fn.taxaSalario());
        System.out.println();
        System.out.println();

        System.out.print("Porcentagem de taxa do salário: ");
        fn.porcentagem = sc.nextDouble();
        System.out.println();
        System.out.print("Atualizado: "+fn.nome);
        System.out.printf(", $%.2f",fn.aumentoSalario());


        sc.close();
    }
}
