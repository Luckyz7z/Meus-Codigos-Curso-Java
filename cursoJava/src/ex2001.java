import java.util.Scanner;

public class ex2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        sc.close();
        if (valor >= 0) {
            System.out.println("NÚMERO POSITIVO");
        } else System.out.println("NÚMERO NEGATIVO");
    }
}
