import java.util.Scanner;

public class ex2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int resultado;
        sc.close();
        if (A >= B) {
            resultado = A / B;
        } else resultado = B / A;
        if (resultado % 1 == 0) {
            System.out.println("São números multiplos");
        } else System.out.println("Não são números multiplos");
    }
}
