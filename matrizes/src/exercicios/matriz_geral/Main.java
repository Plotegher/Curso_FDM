package exercicios.matriz_geral;

// Módulo 04 / Capítulo 09 / aula 04 - Matrizes
// Exercício 07: Matriz geral

import java.util.Arrays;
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

      double[][] matriz = new double[n][n];

      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            System.out.print("Elemento [" + l + "," + c + "]: ");
            matriz[l][c] = scanner.nextDouble();
         }
      }

      double somaPositivos = 0.0;
      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            if (matriz[l][c] > 0)
            {
               somaPositivos += matriz[l][c];
            }
         }
      }
      System.out.printf("SOMA DOS POSITIVOS: %.2f %n", somaPositivos);

      System.out.print("\nEscolha uma linha: ");
      int linha = scanner.nextInt();
      System.out.print("LINHA ESCOLHIDA: ");
      for (double elemento : matriz[linha])
      {
         System.out.print(String.format("%.1f", elemento) + " ");
      }
      System.out.println();

      System.out.print("\nEscolha uma coluna: ");
      int coluna = scanner.nextInt();
      System.out.print("COLUNA ESCOLHIDA: ");
      for (int l = 0; l < n; l++)
      {
         System.out.print(String.format("%.1f", matriz[l][coluna]) + " ");
      }
      System.out.println();

      System.out.print("\nDIAGONAL PRINCIPAL: ");
      for (int l = 0; l < n; l++)
      {
         System.out.print(matriz[l][l] + " ");
      }
      System.out.println();

      double[][] quadrados = new double[n][n];
      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            if (matriz[l][c] < 0)
            {
               quadrados[l][c] = Math.pow(matriz[l][c], 2);
            }
            else
            {
               quadrados[l][c] = matriz[l][c];
            }
         }
      }
      System.out.println("\nMATRIZ ALTERADA:");
      for (int l = 0; l < n; l++)
      {
         for (int c = 0; c < n; c++)
         {
            System.out.print(String.format("%.1f", quadrados[l][c]) + "  ");
         }
         System.out.println();
      }

      scanner.close();
   }
}
