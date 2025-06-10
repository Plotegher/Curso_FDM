package vetores.exercicios_vetores.media_pares;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 08 - Média dos pares

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
      int tamanho = 0;
      for (double elemento : elementos)
      {
         if (elemento % 2 == 0)
         {
            soma += elemento;
            tamanho++;
         }
      }

      double media = soma / tamanho;
      if (media > 0.0)
      {
         System.out.printf("MÉDIA DOS PARES = %.1f", media);
      }
      else
      {
         System.out.println("NENHUM NÚMERO PAR");
      }

      scanner.close();
   }
}
