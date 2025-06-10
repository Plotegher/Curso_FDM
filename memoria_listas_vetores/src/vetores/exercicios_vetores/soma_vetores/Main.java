package vetores.exercicios_vetores.soma_vetores;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 06 - Soma de vetores

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos valores terá cada vetor? ");
      int n = scanner.nextInt();

      int[] vetorA = new int[n];
      int[] vetorB = new int[n];

      System.out.println("Digite os valores do vetor A:");
      for (int i = 0; i < n; i++)
      {
         vetorA[i] = scanner.nextInt();
      }

      System.out.println("Digite os valores do vetor B:");
      for (int i = 0; i < n; i++)
      {
         vetorB[i] = scanner.nextInt();
      }

      int[] resultado = new int[n];
      for (int i = 0; i < n; i++)
      {
         resultado[i] = vetorA[i] + vetorB[i];
      }

      System.out.println("VETOR RESULTANTE:");
      for (int item : resultado)
      {
         System.out.println(item);
      }
      scanner.close();
   }
}
