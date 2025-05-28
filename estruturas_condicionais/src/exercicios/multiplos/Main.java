package exercicios.multiplos;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 10 - Múltiplos

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite dois números inteiros: ");
      int numero1 = scanner.nextInt();
      int numero2 = scanner.nextInt();

      if (numero2 > numero1)
      {
         int provisorio = numero1;
         numero1 = numero2;
         numero2 = provisorio;
      }

      if (numero1 % numero2 == 0)
      {
         System.out.println("São múltiplos");
      }
      else
      {
         System.out.println("Não são múltiplos");
      }

      scanner.close();;
   }
}
