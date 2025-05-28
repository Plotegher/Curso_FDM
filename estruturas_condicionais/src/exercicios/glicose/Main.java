package exercicios.glicose;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 06 - Glicose

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a medida da glicose: ");
      double medida = scanner.nextDouble();

      if (medida <= 100.0)
      {
         System.out.println("Normal");
      }
      else if (medida > 100.0 && medida <= 140.0)
      {
         System.out.println("Elevado");
      }
      else
      {
         System.out.println("Diabetes");
      }

      scanner.close();
   }
}
