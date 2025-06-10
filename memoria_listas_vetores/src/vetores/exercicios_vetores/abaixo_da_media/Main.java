package vetores.exercicios_vetores.abaixo_da_media;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 07 - Abaixo da média

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos elementos terá o vetor? ");
      int n = scanner.nextInt();

      double[] elementos = new double[n];

      for (int i = 0; i < elementos.length; i++)
      {
         System.out.print("Digite um número: ");
         elementos[i] = scanner.nextDouble();
      }

      double soma = 0.0;
      for (double elemento : elementos)
      {
         soma += elemento;
      }
      double media = soma / elementos.length;
      System.out.printf("\nMÉDIA DO VETOR = %.3f %n", media);

      System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
      for (double elemento : elementos)
      {
         if (elemento < media)
         {
            System.out.println(elemento);
         }
      }
      scanner.close();
   }
}
