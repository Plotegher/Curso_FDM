package exercicios.crescente;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 01 - Crescente

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite dois números:");
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      ordem(x, y);

      while (x != y)
      {
         System.out.println("Digite outros dois números:");
         x = scanner.nextInt();
         y = scanner.nextInt();
         ordem(x, y);
      }
   }

   public static void ordem(int x, int y)
   {
      if (x < y)
      {
         System.out.println("CRESCENTE!");
      }
      else if (x > y)
      {
         System.out.println("DECRESCENTE!");
      }
      else
      {
         System.out.println("Fim do programa!");
      }
   }
}
