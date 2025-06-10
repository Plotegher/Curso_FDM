package vetores.exemplo_1;

// Módulo 04 / Capítulo 08 / aulas 04 e 05 - Memória, vetores e listas
// Exemplo 01

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o número de pessoas: ");
      int n = scanner.nextInt();

      double[] vetor = new double[n];

      System.out.println("Digite as alturas das pessoas:");

      for (int i = 0; i < n; i++)
      {
         vetor[i] = scanner.nextDouble();
      }

      double soma = 0.0;
      for (int i = 0; i < n; i++)
      {
         soma += vetor[i];
      }

      System.out.printf("Média das alturas = %.2f", soma / n);

      scanner.close();
   }
}
