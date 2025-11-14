package Aula63Atras;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de funcionario: ");
        int funcionario = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Digite o valor por hora: ");
        double valorPorHora = sc.nextDouble();
        double resultado = horas * valorPorHora;
        System.out.println("Número = " + funcionario);
        System.out.println("Salário = " + resultado);
    }
}
