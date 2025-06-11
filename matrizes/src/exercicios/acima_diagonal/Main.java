package exercicios.acima_diagonal;

// Módulo 04 / Capítulo 09 / aula 04 - Matrizes
// Exercício 06: Acima da diagonal

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

      int soma = 0;
      for (int l = 0; l < n; l++)
      {
         for (int c = 1; c < n; c++)
         {
            if (c > l)
            {
               soma += matriz[l][c];
            }
         }
      }
      System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);

      scanner.close();
   }
}
