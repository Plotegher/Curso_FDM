package exercicios.soma_linhas;

// Módulo 04 / Capítulo 09 / aula 04 - Matrizes
// Exercício 02: Soma de linhas

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

      double[][] matriz = new double[lin][col];

      for (int l = 0; l < lin; l++)
      {
         System.out.println("Digite os elementos da " + (l + 1) + "ª linha:");
         for (int c = 0; c < col; c++)
         {
            matriz[l][c] = scanner.nextDouble();
         }
      }

      double[] vetor = new double[matriz.length];
      for (int l = 0; l < matriz.length; l++)
      {
         double soma = 0.0;
         for (int c = 0; c < matriz[l].length; c++)
         {
            soma += matriz[l][c];
         }
         vetor[l] = soma;
      }

      System.out.println("VETOR GERADO:");
      for (double item : vetor)
      {
         System.out.println(item);
      }
      scanner.close();
   }
}
