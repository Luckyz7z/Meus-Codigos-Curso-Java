package Aula73Ex001;

import java.util.Locale;
import java.util.Scanner;

import static Aula73Ex001.classe.calculoDolar;

public class Programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do Dolar: ");
        double valorDolar = sc.nextDouble();

        System.out.print("Digite quantos dolares deseja comprar: ");
        double quantidadeDolar = sc.nextDouble();
        double valorReais = calculoDolar(valorDolar, quantidadeDolar);

        System.out.printf("Valor a pagar em reais com a taxa: %.2f", valorReais);
    }
}




