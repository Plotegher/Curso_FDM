package exercicios.menor_de_tres;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 03 - Menor de três

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Primeiro valor: ");
      double valor1 = scanner.nextDouble();
      System.out.print("Segundo valor: ");
      double valor2 = scanner.nextDouble();
      System.out.print("Terceiro valor: ");
      double valor3 = scanner.nextDouble();

      double menor = 0.0;
      if (valor1 < valor2 && valor1 < valor3)
      {
         menor = valor1;
      }
      else if (valor2 < valor1 && valor2 < valor3)
      {
         menor = valor2;
      }
      else
      {
         menor = valor3;
      }
      System.out.println("MENOR = " + menor);

      scanner.close();
   }
}
