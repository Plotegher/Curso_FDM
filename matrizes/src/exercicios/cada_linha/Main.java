package exercicios.cada_linha;

// Módulo 04 / Capítulo 09 / aula 04 - Matrizes
// Exercício 04: Maior de cada linha

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Qual a ordem da matriz? ");
      int n = scanner.nextInt();

      int[][] matriz = new int[n][n];

      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            System.out.print("Elemento [" + l + "," + c + "]: ");
            matriz[l][c] = scanner.nextInt();
         }
      }

      System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
      for (int l = 0; l < n; l++)
      {
         int maior = 0;
         for (int c = 0; c < n; c++)
         {
            if (maior < matriz[l][c])
            {
               maior = matriz[l][c];
            }
         }
         System.out.println(maior);
      }
      scanner.close();
   }
}
