package exercicios.lanchonete;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 09 - Lanchonete

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Código do produto comprado: ");
      double produto = scanner.nextDouble();

      double total = 0.0;
      if (produto == 1)
      {
         System.out.print("Quantidade comprada: ");
         double quantidade = scanner.nextDouble();
         total = 5.00 * quantidade;
         System.out.printf("Valor a pagar: R$ %.2f", total);
      }
      else if (produto == 2)
      {
         System.out.print("Quantidade comprada: ");
         double quantidade = scanner.nextDouble();
         total = 3.50 * quantidade;
         System.out.printf("Valor a pagar: R$ %.2f", total);
      }
      else if (produto == 3)
      {
         System.out.print("Quantidade comprada: ");
         double quantidade = scanner.nextDouble();
         total = 4.80 * quantidade;
         System.out.printf("Valor a pagar: R$ %.2f", total);
      }
      else if (produto == 4)
      {
         System.out.print("Quantidade comprada: ");
         double quantidade = scanner.nextDouble();
         total = 8.90 * quantidade;
         System.out.printf("Valor a pagar: R$ %.2f", total);
      }
      else if (produto == 5)
      {
         System.out.print("Quantidade comprada: ");
         double quantidade = scanner.nextDouble();
         total = 7.32 * quantidade;
         System.out.printf("Valor a pagar: R$ %.2f", total);
      }
      else
      {
         System.out.println("Produto não encontrado!");
      }

      scanner.close();
   }
}
