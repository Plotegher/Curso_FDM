package exercicios.temperatura;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 08 - Temperatura

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
      char escala = scanner.next().toUpperCase().charAt(0);

      if (escala == 'C')
      {
         System.out.print("Digite a temperatura em Cesius: ");
         double celsius = scanner.nextDouble();
         double fahrenheit = celsius * (9.0 / 5.0) + 32.0;
         System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahrenheit);
      }
      else if (escala == 'F')
      {
         System.out.print("Digite a temperatura em Fahrenheit: ");
         double fahrenheit = scanner.nextDouble();
         double celsius = fahrenheit * (5.0 / 9.0) - 32.0;
         System.out.printf("Temperatura equivalente em Celsius: %.2f", celsius);
      }
      else
      {
         System.out.println("Opção inválida!");
      }

      scanner.close();
   }
}
