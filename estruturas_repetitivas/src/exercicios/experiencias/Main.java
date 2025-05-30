package exercicios.experiencias;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 16 - Experiências

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos casos de teste serão digitados? ");
      int n = scanner.nextInt();

      int cobaias = 0, coelhos = 0, ratos = 0, sapos = 0;

      for (int i = 0; i < n; i++)
      {
         System.out.print("Quantidade de cobaias: ");
         int quantidade = scanner.nextInt();
         System.out.print("Tipo de cobaia: ");
         char tipo = scanner.next().toUpperCase().charAt(0);

         if (tipo == 'C')
         {
            coelhos += quantidade;
         }
         else if (tipo == 'R')
         {
            ratos += quantidade;
         }
         else if (tipo == 'S')
         {
            sapos += quantidade;
         }
         else
         {
            System.out.println("Escolha C, R ou S");
         }
         cobaias = coelhos + ratos + sapos;
      }

      double percCoelhos = (double) coelhos / cobaias * 100.0;
      double percRatos = (double) ratos / cobaias * 100.0;
      double percSapos = (double) sapos / cobaias * 100.0;

      System.out.println("\nRELATÓRIO FINAL:");
      System.out.println("Total: " + cobaias + " cobaias");
      System.out.println("Total de coelhos: " + coelhos);
      System.out.println("Total de ratos: " + ratos);
      System.out.println("Total de sapos: " + sapos);
      System.out.printf("Percentual de coelhos: %.2f %n", percCoelhos);
      System.out.printf("Percentual de ratos: %.2f %n", percRatos);
      System.out.printf("Percentual de sapos: %.2f %n", percSapos);

      scanner.close();
   }
}
