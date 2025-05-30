package exercicios.pares_consecutivos;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 07 - Pares consecutivos

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite um número inteiro: ");
      int x = scanner.nextInt();

      int soma = 0;
      while (x != 0)
      {
         if (x % 2 != 0)
         {
            x++;
         }
         soma = 5 * x + 20;
         System.out.println(soma);

         System.out.print("Digite um número inteiro: ");
         x = scanner.nextInt();
      }
      scanner.close();
   }
}
