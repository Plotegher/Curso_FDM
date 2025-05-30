package exercicios.tabuada;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 08 - Tabuada

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Deseja a tabuada para qual valor? ");
      int valor = scanner.nextInt();

      for (int i = 1; i < 11; i++)
      {
         System.out.println(valor + " x " + i + " = " + valor * i);
      }

      scanner.close();
   }
}
