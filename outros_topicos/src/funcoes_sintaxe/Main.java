package funcoes_sintaxe;

// Módulo 04 / Capítulo 05 / aula 04 - Funções (sintaxe)

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite 3 valores: ");
      double valor1 = scanner.nextDouble();
      double valor2 = scanner.nextDouble();
      double valor3 = scanner.nextDouble();

      double resultado = maiorDeTres(valor1, valor2, valor3);
      imprimir(resultado);

      scanner.close();
   }

   public static double maiorDeTres(double valorA, double valorB, double valorC)
   {
      if (valorA > valorB && valorA > valorC)
      {
         return valorA;
      }
      else return Math.max(valorB, valorC);
   }

   public static void imprimir(double valor)
   {
      System.out.println("O maior valor é: " + valor);
   }
}
