package exemplo.programa;

// Módulo 04 / Capítulo 07 / aulas 02 e 03 - Construtores, this, sobrecarga e encapsulamento
// Exemplo

import exemplo.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite os dados do produto:");
      System.out.print("Nome: ");
      String nomeScanner = scanner.nextLine();
      System.out.print("Preço: ");
      double precoScanner = scanner.nextDouble();

      Produto produto = new Produto(nomeScanner, precoScanner);

      produto.setNomeAtributo("Computador");
      System.out.println("Nome atualizado: " + produto.getNomeAtributo());

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
