package vetores.exemplo_2.programa;

// Módulo 04 / Capítulo 08 / aulas 04 e 05 - Memória, vetores e listas
// Exemplo 02

import vetores.exemplo_2.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o número de produtos: ");
      int n = scanner.nextInt();

      Produto[] vetor = new Produto[n];

      for (int i = 0; i < n; i++)
      {
         System.out.print("Nome: ");
         scanner.nextLine();
         String nome = scanner.nextLine();
         System.out.print("Preço: ");
         double preco = scanner.nextDouble();
         vetor[i] = new Produto(nome, preco);
      }

      double soma = 0.0;
      for (int i = 0; i < n; i++)
      {
         soma += vetor[i].getPreco();
      }
      System.out.printf("\nMédia de preços: %.2f %n", soma / n);

      System.out.println("\nLista de produtos:");
      for (int i = 0; i < n; i++)
      {
         System.out.println(vetor[i]);
      }

      scanner.close();
   }
}
