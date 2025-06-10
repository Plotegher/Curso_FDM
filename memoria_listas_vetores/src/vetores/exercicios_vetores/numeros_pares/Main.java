package vetores.exercicios_vetores.numeros_pares;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 04 - Números pares

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

      int[] numeros = new int[n];

      for (int i = 0; i < numeros.length; i++)
      {
         System.out.print("Digite um número: ");
         numeros[i] = scanner.nextInt();
      }

      System.out.println("\nNÚMEROS PARES:");
      for (int numero : numeros)
      {
         if (numero % 2 == 0)
         {
            System.out.print(numero + "  ");
         }
      }

      int soma = 0;
      for (int numero : numeros)
      {
         if (numero % 2 == 0)
         {
            soma++;
         }
      }
      System.out.println("\nQUANTIDADE DE PARES = " + soma);

      scanner.close();
   }
}
