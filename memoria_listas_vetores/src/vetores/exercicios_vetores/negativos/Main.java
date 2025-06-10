package vetores.exercicios_vetores.negativos;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 01 - Negativos

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos numeros voce vai digitar (máximo 10)? ");
      int n = scanner.nextInt();
      if (n > 10)
      {
         n = 10;
      }

      int[] numeros = new int[n];

      for (int i = 0; i < numeros.length; i++)
      {
         System.out.print("Digite um numero: ");
         numeros[i] = scanner.nextInt();
      }

      System.out.println("NÚMEROS NEGATIVOS:");
      for (int lido : numeros)
      {
         if (lido < 0)
         {
            System.out.println(lido);
         }
      }
      scanner.close();
   }
}
