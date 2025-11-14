package Aula63Atras;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();
        int resultado = (A * B) - (C * D);
        System.out.println("DIFERENÇA: " + resultado);
    }
}
