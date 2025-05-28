package exercicios.coordenadas;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 13 - Coordenadas

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Valor de X: ");
      double x = scanner.nextDouble();
      System.out.print("Valor de Y: ");
      double y = scanner.nextDouble();

      if (x > 0 && y > 0)
      {
         System.out.println("Q1");
      }
      else if (x < 0 && y > 0)
      {
         System.out.println("Q2");
      }
      else if (x < 0 && y < 0)
      {
         System.out.println("Q3");
      }
      else if (x > 0 && y < 0)
      {
         System.out.println("Q4");
      }
      else if (y == 0 && x != 0)
      {
         System.out.println("Eixo X");
      }
      else if (y != 0)
      {
         System.out.println("Eixo Y");
      }
      else
      {
         System.out.println("Origem");
      }

      scanner.close();
   }
}
