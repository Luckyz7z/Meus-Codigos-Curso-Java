import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1, cod2, quant1, quant2;
        double valor1, valor2, valorTotal;
        System.out.print("Digite o código da peça, quantidade de peças e valor da peça: ");
        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();
        System.out.print("Digite o código da peça, quantidade de peças e valor da peça: ");
        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();
        valorTotal = (quant1 * valor1) + (quant2 * valor2);
        System.out.printf("O valor total é %.2f",valorTotal);

    }
}
