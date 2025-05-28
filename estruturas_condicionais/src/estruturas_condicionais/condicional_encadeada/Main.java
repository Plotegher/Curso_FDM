package estruturas_condicionais.condicional_encadeada;

// Módulo 04 / Capítulo 03 / aula 04 - Estruturas condicionais em Java
// Condicional encadeada

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

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
