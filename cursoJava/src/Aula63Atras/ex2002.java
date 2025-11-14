package Aula63Atras;

import java.util.Scanner;

public class ex2002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        sc.close();
        if (valor % 2 == 0){
            System.out.println("NÚMERO PAR");
        } else System.out.println("NÚMERO IMPAR");
    }
}
