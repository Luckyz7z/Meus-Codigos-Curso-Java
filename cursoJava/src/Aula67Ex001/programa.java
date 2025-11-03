package Aula67Ex001;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        estoque estoque = new estoque();
        System.out.print("Nome: ");
        estoque.nome = sc.nextLine();
        System.out.print("Preço: ");
        estoque.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        estoque.quantidade = sc.nextInt();
        System.out.println(estoque);
        System.out.println();
        System.out.print("Coloque o valor do produto para ser adcionado no estoque: ");
        int quantidade = sc.nextInt();
        estoque.adcionarProduto(quantidade);

        System.out.println("Atualizado: " + estoque);
        System.out.println();

        System.out.print("Digite o valor para remover do estoque: ");
        quantidade = sc.nextInt();
        estoque.removerProduto(quantidade);

        System.out.println("Atualizado: " + estoque);
        System.out.println();

        sc.close();
    }
}
