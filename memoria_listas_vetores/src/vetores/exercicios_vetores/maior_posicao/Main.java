package vetores.exercicios_vetores.maior_posicao;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 05 - Maior posição

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos números você vai digitar? ");
      int n = scanner.nextInt();

      double[] reais = new double[n];

      for (int i = 0; i < reais.length; i++)
      {
         System.out.print("Digite um número: ");
         reais[i] = scanner.nextDouble();
      }

      double maior = 0.0;
      int posicao = 0;
      for (int i = 0; i < reais.length; i++)
      {
         if (reais[i] > maior)
         {
            maior = reais[i];
            posicao = i;
         }
      }
      System.out.printf("\nMAIOR VALOR = %.1f %n", maior);

      System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);

      scanner.close();
   }
}
