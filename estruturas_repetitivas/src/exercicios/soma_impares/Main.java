package exercicios.soma_impares;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 09 - Soma de ímpares

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite dois números: ");
      int inferior = scanner.nextInt();
      int superior = scanner.nextInt();

      int troca;
      if (superior < inferior)
      {
         troca = inferior;
         inferior = superior;
         superior = troca;
      }

      int soma = 0;
      for (int i = inferior + 1; inferior < superior; inferior++)
      {
         if (inferior % 2 != 0)
         {
            soma += inferior;
         }
      }

      System.out.printf("SOMA DOS ÍMPARES: %d", soma);
      scanner.close();
   }
}
