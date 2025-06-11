package exercicios.soma_matrizes;

// Módulo 04 / Capítulo 09 / aula 04 - Matrizes
// Exercício 05: Soma de matrizes

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantas linhas terá cada matriz? ");
      int lin = scanner.nextInt();
      System.out.print("Quantas colunas terá cada matriz? ");
      int col = scanner.nextInt();

      int[][] matrizA = new int[lin][col];
      int[][] matrizB = new int[lin][col];
      int[][] matrizSoma = new int[lin][col];

      System.out.println("Digite os valores da matriz A:");
      for (int l = 0; l < lin; l++)
      {
         for (int c = 0; c < col; c++)
         {
            System.out.print("Elemento [" + l + "," + c + "]: ");
            matrizA[l][c] = scanner.nextInt();
         }
      }

      System.out.println("Digite os valores da matriz B:");
      for (int l = 0; l < lin; l++)
      {
         for (int c = 0; c < col; c++)
         {
            System.out.print("Elemento [" + l + "," + c + "]: ");
            matrizB[l][c] = scanner.nextInt();
         }
      }

      System.out.println("MATRIZ SOMA:");
      for (int l = 0; l < lin; l++)
      {
         for (int c = 0; c < col; c++)
         {
            matrizSoma[l][c] = matrizA[l][c] + matrizB[l][c];
         }
      }

      for (int l = 0; l < lin; l++)
      {
         for (int c = 0; c < col; c++)
         {
            System.out.print(matrizSoma[l][c] + "  ");
         }
         System.out.println();
      }
      scanner.close();
   }
}
