package exercicios.quadrante;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 04 - Quadrante

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite os valores das coordenadas X e Y:");
      double x = scanner.nextDouble();
      double y = scanner.nextDouble();

      while (x != 0.0 || y != 0.0)
      {
         if (x > 0 && y > 0)
         {
            System.out.println("QUADRANTE Q1");
         }
         else if (x < 0 && y > 0)
         {
            System.out.println("QUADRANTE Q2");
         }
         else if (x < 0 && y < 0)
         {
            System.out.println("QUADRANTE Q3");
         }
         else if (x > 0 && y < 0)
         {
            System.out.println("QUADRANTE Q4");
         }
         else
         {
            break;
         }
         System.out.println("Digite os valores das coordenadas X e Y:");
         x = scanner.nextDouble();
         y = scanner.nextDouble();
      }
      scanner.close();
   }
}
