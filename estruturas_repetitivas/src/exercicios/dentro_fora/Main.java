package exercicios.dentro_fora;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 11 - Dentro e fora

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

      int dentro = 0;
      int fora = 0;
      for (int i = 0; i < n; i++)
      {
         System.out.print("Digite um número: ");
         int numero = scanner.nextInt();

         if (numero >= 10 && numero <= 20)
         {
            dentro++;
         }
         else
         {
            fora++;
         }
      }
      System.out.println(dentro + " DENTRO");
      System.out.println(fora + " FORA");

      scanner.close();
   }
}
