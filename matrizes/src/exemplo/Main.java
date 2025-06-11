package exemplo;

// Módulo 04 / Capítulo 09 / aula 03 - Matrizes
// Exemplo - Problema Diagonal e Negativos

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a ordem da matriz: ");
      int n = scanner.nextInt();

      int[][] matriz = new int[n][n];

      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            System.out.print("Digite um número: ");
            matriz[l][c] = scanner.nextInt();
         }
      }

      System.out.println("\nMatriz:");
      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            System.out.print(matriz[l][c] + "  ");
         }
         System.out.println();
      }

      System.out.println("\nDiagonal principal:");
      for (int l = 0; l < n; l++)
      {
         System.out.print(matriz[l][l] + " ");
      }
      System.out.println();

      int negativos = 0;
      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            if (matriz[l][c] < 0)
            {
               negativos++;
            }
         }
      }
      System.out.println("\nNúmeros negativos: " + negativos);

      scanner.close();
   }
}
