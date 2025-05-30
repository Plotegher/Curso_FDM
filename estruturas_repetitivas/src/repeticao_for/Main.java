package repeticao_for;

// Módulo 04 / Capítulo 04 / aula 06 - Estrutura repetitiva for (para)

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos números você digitará? ");
      int n = scanner.nextInt();

      int soma = 0;
      for (int i = 0; i < n; i++)
      {
         System.out.print("Digite um número: ");
         int x = scanner.nextInt();
         soma += x;
      }
      System.out.println("Soma = " + soma);
   }
}
