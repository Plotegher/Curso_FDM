package exemplo.programa;

// Módulo 04 / Capítulo 06 / aulas 05, 06 e 07 - Classes, atributos, métodos e static
// Resolução de outro exemplo com POO

import exemplo.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Produto produto = new Produto();

      System.out.println("Digite os dados do produto:");
      System.out.print("Nome: ");
      produto.nome = scanner.nextLine();
      System.out.print("Preço: ");
      produto.preco = scanner.nextDouble();
      System.out.print("Quantidade em estoque: ");
      produto.quantidade = scanner.nextInt();

      System.out.println("\nDados do produto: " + produto);

      System.out.print("\nDigite a quantidade de produtos para adicionar ao estoque: ");
      produto.adicionaProduto(scanner.nextInt());

      System.out.println("\nDados atualizados: " + produto);

      System.out.print("\nDigite a quantidade de produtos para remover do estoque: ");
      produto.removeProduto(scanner.nextInt());

      System.out.println("\nDados atualizados: " + produto);

      scanner.close();
   }
}
