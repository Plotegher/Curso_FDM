package exercicios.divisao;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 14 - Divisão

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

      for (int i = 0; i < n; i++)
      {
         System.out.print("Entre com o numerador: ");
         double numerador = scanner.nextDouble();
         System.out.print("Entre com o denominador: ");
         double denominador = scanner.nextDouble();

         if (denominador == 0)
         {
            System.out.println("DIVISÃO IMPOSSÍVEL");
         }
         else
         {
            System.out.printf("DIVISÃO = %.2f %n", numerador / denominador);
         }
      }

      scanner.close();
   }
}
