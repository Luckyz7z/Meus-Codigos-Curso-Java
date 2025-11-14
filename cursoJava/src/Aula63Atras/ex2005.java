package Aula63Atras;

import java.util.Scanner;

public class ex2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double calculo;
        // 1 = 4,50 | 2 = 4.50 | 3 = 5 | 4 = 2 | 5 = 1.50|
        if (c == 1) {
            calculo = d * 4.00;
        } else if (c == 2) {
            calculo = d * 4.50;
        } else if (c == 3) {
            calculo = d * 5.00;
        } else if (c == 4) {
            calculo = d * 2;
        } else calculo = d * 1.50;
        System.out.printf("TOTAL DO PEDIDO: %.2f\n", calculo);
    }
}
