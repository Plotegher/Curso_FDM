package exercicios.fatorial;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 15 - Fatorial

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      int n = 16;
      while (n > 15)
      {
         System.out.print("Digite o valor de N: ");
         n = scanner.nextInt();
      }

      int fatorial = 1;
      for (int i = 1; i <= n; i++)
      {
         fatorial = fatorial * i;
      }
      System.out.println("FATORIAL = " + fatorial);

      scanner.close();
   }
}
