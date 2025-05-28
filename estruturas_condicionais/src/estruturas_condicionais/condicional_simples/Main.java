package estruturas_condicionais.condicional_simples;

// Módulo 04 / Capítulo 03 / aula 04 - Estruturas condicionais em Java
// Condicional simples

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      // CONDIÇÃO SIMPLES

      System.out.println("\nCONDIÇÃO SIMPLES");
      System.out.print("Digite uma letra (P ou B): ");
      char letra = scanner.next().toUpperCase().charAt(0);

      if (letra == 'P')
      {
         System.out.println("Preto!");
      }

      if (letra == 'B')
      {
         System.out.println("Branco!");
      }

      scanner.close();
   }
}
