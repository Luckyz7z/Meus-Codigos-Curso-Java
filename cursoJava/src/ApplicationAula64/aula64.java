package ApplicationAula64;

import java.util.Locale;
import java.util.Scanner;

public class aula64 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        double xA, xB, xC, yA, yB, yC, p1, p2, calculo1, calculo2;
        System.out.print("Digite os 3 lados do triangulo 1: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os 3 lados do triangulo 2: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        calculo1 = x.area();
        calculo2 = y.area();
        System.out.printf("Valor área X: %.4f%n", calculo1);
        System.out.printf("Valor área y: %.4f%n", calculo2);
        if (calculo1 > calculo2){
            System.out.println("A area do triangulo X e maior.");
        } else System.out.println("A area do triangulo Y e maior");


    }
}
