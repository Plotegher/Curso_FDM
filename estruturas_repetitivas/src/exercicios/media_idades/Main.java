package exercicios.media_idades;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 02 - Média de idades

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      double idade, n, somaIdade;

      System.out.println("Digite as idades:");
      idade = scanner.nextDouble();

      if (idade < 0.0)
      {
         System.out.println("IMPOSSÍVEL CALCULAR");
      }
      else
      {
         somaIdade = 0.0;
         n = 0.0;
         while (idade >= 0.0)
         {
            somaIdade += idade;
            n++;
            idade = scanner.nextDouble();
         }
         System.out.printf("MÉDIA = %.2f", somaIdade / n);
      }
      scanner.close();
   }
}
