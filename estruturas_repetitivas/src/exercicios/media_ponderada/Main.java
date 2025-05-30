package exercicios.media_ponderada;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 13 - Média ponderada

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos casos você vai digitar? ");
      int n = scanner.nextInt();

      double media = 0.0;
      for (int i = 0; i < n; i++)
      {
         System.out.println("Digite três números:");
         double numero1 = scanner.nextDouble();
         double numero2 = scanner.nextDouble();
         double numero3 = scanner.nextDouble();

         media = ((numero1 * 2) + (numero2 * 3) + (numero3 * 5)) / (2 + 3 + 5);
         System.out.printf("MÉDIA = %.1f %n", media);
      }

      scanner.close();
   }
}
