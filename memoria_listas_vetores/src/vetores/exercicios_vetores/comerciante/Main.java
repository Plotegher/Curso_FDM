package vetores.exercicios_vetores.comerciante;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 12 - Comerciante

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Serão digitados quantos produtos? ");
      int n = scanner.nextInt();

      String[] nomes = new String[n];
      double[] compras = new double[n];
      double[] vendas = new double[n];

      for (int i = 0; i < n; i++)
      {
         System.out.println("\nProduto " + (i + 1) + ":");
         System.out.print("Nome: ");
         scanner.nextLine();
         nomes[i] = scanner.nextLine();
         System.out.print("Preço de compra: ");
         compras[i] = scanner.nextDouble();
         System.out.print("Preço de venda: ");
         vendas[i] = scanner.nextDouble();
      }

      double[] porcentagem = new double[n];
      for (int i = 0; i < n; i++)
      {
         porcentagem[i] = (vendas[i] / compras[i]) - 1;
      }

      int menos10 = 0;
      int de10a20 = 0;
      int mais20 = 0;
      for (int i = 0; i < n; i++)
      {
         if (porcentagem[i] < 0.1)
         {
            menos10++;
         }
         else if (porcentagem[i] >= 0.1 && porcentagem[i] < 0.2)
         {
            de10a20++;
         }
         else
         {
            mais20++;
         }
      }

      double totalCompras = 0.0;
      double totalVendas = 0.0;
      for (int i = 0; i < n; i++)
      {
         totalCompras += compras[i];
         totalVendas += vendas[i];
      }

      System.out.println("\nRELATÓRIO:");
      System.out.println("Lucro abaixo de 10%: " + menos10);
      System.out.println("Lucro entre 10% e 20%: " + de10a20);
      System.out.println("Lucro acima de 20%: " + mais20);
      System.out.printf("Valor total de compras: %.2f %n", totalCompras);
      System.out.printf("Valor total de vendas: %.2f %n", totalVendas);
      System.out.printf("Lucro total: %.2f %n", totalVendas - totalCompras);

      scanner.close();
   }
}
