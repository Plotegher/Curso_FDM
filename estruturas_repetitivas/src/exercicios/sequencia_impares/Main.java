package exercicios.sequencia_impares;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 10 - Sequência de ímpares

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o valor de X: ");
      int valor = scanner.nextInt();

      for (int i = 0; i <= valor; i++)
      {
         if (i % 2 != 0)
         {
            System.out.println(i);
         }
      }

      scanner.close();
   }
}
