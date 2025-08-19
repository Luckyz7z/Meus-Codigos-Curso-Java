import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int B = sc.nextInt();
        int resultado = A + B;
        System.out.printf("A soma de %d + %d é igual a: %d", A, B, resultado);
        sc.close();

    }
}