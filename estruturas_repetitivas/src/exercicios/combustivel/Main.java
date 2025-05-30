package exercicios.combustivel;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 06 - Combustível

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
      int codigo = scanner.nextInt();

      int alcool = 0;
      int gasolina = 0;
      int diesel = 0;

      while (codigo != 4)
      {
         if (codigo == 1)
         {
            alcool++;
         }
         else if (codigo == 2)
         {
            gasolina++;
         }
         else if (codigo == 3)
         {
            diesel++;
         }
         System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
         codigo = scanner.nextInt();
      }

      System.out.println("MUITO OBRIGADO");
      System.out.println("Álcool: " + alcool);
      System.out.println("Gasolina: " + gasolina);
      System.out.println("Diesel: " + diesel);

      scanner.close();
   }
}
