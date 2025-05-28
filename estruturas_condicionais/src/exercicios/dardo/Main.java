package exercicios.dardo;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 07 - Dardo

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite as três distâncias: ");
      double distancia1 = scanner.nextDouble();
      double distancia2 = scanner.nextDouble();
      double distancia3 = scanner.nextDouble();

      if (distancia1 > distancia2 && distancia1 > distancia3)
      {
         System.out.printf("MAIOR DISTÂNCIA = %.2f", distancia1);
      }
      else if (distancia2 > distancia1 && distancia2 > distancia3)
      {
         System.out.printf("MAIOR DISTÂNCIA = %.2f", distancia2);
      }
      else
      {
         System.out.printf("MAIOR DISTÂNCIA = %.2f", distancia3);
      }

      scanner.close();
   }
}
