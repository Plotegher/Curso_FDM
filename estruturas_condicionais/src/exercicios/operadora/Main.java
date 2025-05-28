package exercicios.operadora;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 04 - Operadora

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a quantidade de minutos: ");
      double minutos = scanner.nextDouble();

      if (minutos <= 100.0)
      {
         System.out.printf("Valor a pagar: R$ %.2f", 50.0);
      }
      else
      {
         System.out.printf("Valor a pagar: R$ %.2f", 50.0 + ((minutos - 100.0) * 2.0));
      }

      scanner.close();
   }
}
