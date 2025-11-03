package Aula70Ex001;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        retangulo rt = new retangulo();
        System.out.print("Digite a altura do retangulo: ");
        rt.altura = sc.nextDouble();
        System.out.print("Digite a largura do retangulo: ");
        rt.largura = sc.nextDouble();
        System.out.printf("Área: %.2f", rt.area());
        System.out.println();
        System.out.printf("Perimetro: %.2f", rt.perimetro());
        System.out.println();
        System.out.printf("Diagonal: %.2f", rt.diagonal());
        sc.close();
    }
}
