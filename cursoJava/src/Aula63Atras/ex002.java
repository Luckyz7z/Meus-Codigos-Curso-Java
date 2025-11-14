package Aula63Atras;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.print("Digite o raio do circulo: ");
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double resultado = raio * pi;
        System.out.printf("O valor da área é: %.4f", resultado);
        sc.close();
    }
}
