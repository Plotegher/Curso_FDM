package estruturas_condicionais.condicional_composta;

// Módulo 04 / Capítulo 03 / aula 04 - Estruturas condicionais em Java
// Condicional composta

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

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

      scanner.close();
   }
}
