package exercicios.troco_verificado;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 05 - Troco verificado

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Preço unitário do produto: ");
      double preco = scanner.nextDouble();
      System.out.print("Quantidade comprada: ");
      double quantidade = scanner.nextDouble();
      System.out.print("Dinheiro recebido: ");
      double recebido = scanner.nextDouble();

      double total = preco * quantidade;
      if (recebido > total)
      {
         System.out.printf("TROCO = %.2f %n", recebido - total);
      }
      else
      {
         System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS",
               total - recebido);
      }

      scanner.close();
   }
}
