import java.util.Scanner;

public class ex2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horainicio = sc.nextInt();
        int horafinal = sc.nextInt();
        int resultado;
        sc.close();
        if (horainicio > horafinal || horafinal + horainicio == 0) {
            resultado = 24 - horainicio + horafinal;
        } else resultado = horafinal - horainicio;
        System.out.println("TOTAL DE HORAS DO JOGO: " + resultado);
    }
}
