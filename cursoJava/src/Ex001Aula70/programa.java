package Ex001Aula70;

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
        System.out.printf("Área: " + rt.area());
        System.out.printf("Perimetro: "+ rt.perimetro());
        sc.close();
    }
}
