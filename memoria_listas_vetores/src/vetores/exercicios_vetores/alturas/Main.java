package vetores.exercicios_vetores.alturas;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 03 - Alturas

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantas pessoas serão digitadas? ");
      int n = scanner.nextInt();

      String[] nomes = new String[n];
      int[] idades = new int[n];
      double[] alturas = new double[n];

      for (int i = 0; i < n; i++)
      {
         System.out.println("Dados da " + (i + 1) + "ª pessoa:" );
         System.out.print("Nome: ");
         scanner.nextLine();
         nomes[i] = scanner.nextLine();
         System.out.print("Idade: ");
         idades[i] = scanner.nextInt();
         System.out.print("Altura: ");
         alturas[i] = scanner.nextDouble();
      }

      double soma = 0.0;
      for (int i = 0; i < n; i++)
      {
         soma += alturas[i];
      }
      System.out.printf("\nAltura média: %.2f %n", soma / n);

      double menos16 = 0;
      for (int i = 0; i < n; i++)
      {
         if (idades[i] < 16)
         {
            menos16++;
         }
      }
      System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", (menos16 / n) * 100);

      for (int i = 0; i < n; i++)
      {
         if (idades[i] < 16)
         {
            System.out.println(nomes[i]);
         }
      }
      scanner.close();
   }
}
