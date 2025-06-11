package exercicios.negativos_matriz;

// Módulo 04 / Capítulo 09 / aula 04 - Matrizes
// Exercício 03: Negativos da matriz

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Qual a quantidade de linhas da matriz? ");
      int lin = scanner.nextInt();
      System.out.print("Qual a quantidade de colunas da matriz? ");
      int col = scanner.nextInt();

      int[][] matriz = new int[lin][col];

      for (int l = 0; l < lin; l++)
      {
         for (int c = 0; c < col; c++)
         {
            System.out.print("Elemento [" + l + "," + c + "]: ");
            matriz[l][c] = scanner.nextInt();
         }
      }

      System.out.println("VALORES NEGATIVOS:");
      for (int l = 0; l < lin; l++)
      {
         for (int c = 0; c < col; c++)
         {
            if (matriz[l][c] < 0)
            {
               System.out.println(matriz[l][c]);
            }
         }
      }
      scanner.close();
   }
}
