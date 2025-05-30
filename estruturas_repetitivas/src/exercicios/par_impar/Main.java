package exercicios.par_impar;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 12 - Par ou ímpar

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos números você vai digitar? ");
      int n = scanner.nextInt();

      String parImpar = " ";
      String positivoNegativo = " ";
      for (int i = 0; i < n; i++)
      {
         System.out.print("Digite um número: ");
         int numero = scanner.nextInt();

         if (numero == 0)
         {
            System.out.println("NULO");
         }
         else
         {
            if (numero % 2 == 0)
            {
               positivoNegativo = (numero > 0) ? "POSITIVO" : "NEGATIVO";
               System.out.println("PAR " + positivoNegativo);
            }
            else
            {
               positivoNegativo = (numero > 0) ? "POSITIVO" : "NEGATIVO";
               System.out.println("ÍMPAR " + positivoNegativo);
            }
         }
      }

      scanner.close();
   }
}
