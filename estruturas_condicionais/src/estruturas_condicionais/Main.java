package estruturas_condicionais;

// Módulo 04 / Capítulo 03 / aula 04 - Estruturas condicionais em Java

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

      // CONDIÇÃO COMPOSTA

      System.out.println("\nCONDIÇÃO COMPOSTA");
      System.out.print("Digite uma hora (24 h): ");
      int hora = scanner.nextInt();

      if (hora >= 6 && hora <= 11)
      {
         System.out.println("Bom dia!");
      }
      else if (hora >= 12 && hora <= 18)
      {
         System.out.println("Boa tarde!");
      }
      else
      {
         System.out.println("Boa noite!");
      }

      // CONDIÇÃO ENCADEADA

      System.out.println("\nCONDIÇÃO ENCADEADA");
      System.out.print("O objeto está se movendo (S ou N)? ");
      char resp1 = scanner.next().toUpperCase().charAt(0);

      if (resp1 == 'S')
      {
         System.out.print("Deveria (S ou N)? ");
         char resp2 = scanner.next().toUpperCase().charAt(0);

         if (resp2 == 'N')
         {
            System.out.println("Use Silver Tape!");
         }
         else
         {
            System.out.println("Não há problema!");
         }
      }
      else
      {
         System.out.print("Deveria (S ou N)? ");
         char resp2 = scanner.next().toUpperCase().charAt(0);

         if (resp2 == 'S')
         {
            System.out.println("Use WD-40!");
         }
         else
         {
            System.out.println("Não há problema!");
         }
      }
      scanner.close();
   }
}
