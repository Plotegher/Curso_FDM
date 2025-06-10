package vetores.exercicios_vetores.soma_vetor;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 02 - Soma vetor

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos numeros voce vai digitar? ");
      int n = scanner.nextInt();

      double[] numeros = new double[n];

      for (int i = 0; i < numeros.length; i++)
      {
         System.out.print("Digite um número: ");
         numeros[i] = scanner.nextDouble();
      }

      System.out.print("VALORES = ");
      for (double item : numeros)
      {
         System.out.print(String.format("%.1f", item)+ "  ");
      }

      double soma = 0.0;
      for (double item : numeros)
      {
         soma += item;
      }
      System.out.printf("\nSOMA = %.2f %n", soma);

      System.out.printf("MÉDIA = %.2f %n", soma / n);

      scanner.close();
   }
}
