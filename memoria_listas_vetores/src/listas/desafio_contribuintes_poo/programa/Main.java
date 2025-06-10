package listas.desafio_contribuintes_poo.programa;

// Módulo 04 / Capítulo 08 / aula 12 - Memória, vetores e listas
// Desafio Contribuintes com OO e Lista

import listas.desafio_contribuintes_poo.entidades.Contribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      List<Contribuinte> contribuintes = new ArrayList<>();
      Contribuinte contribuinte = null;

      System.out.print("Quantos contribuintes você vai digitar? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         System.out.println("\nDigite os dados do " + (i + 1) + "° contribuinte:");
         System.out.print("Renda anual com salário: ");
         Double salario = scanner.nextDouble();
         System.out.print("Renda anual com prestação de serviço: ");
         Double servico = scanner.nextDouble();
         System.out.print("Renda anual com ganho de capital: ");
         Double capital = scanner.nextDouble();
         System.out.print("Gastos médicos: ");
         Double saude = scanner.nextDouble();
         System.out.print("Gastos educacionais: ");
         Double educacao = scanner.nextDouble();

         contribuinte = new Contribuinte(salario, servico, capital, saude, educacao);

         contribuintes.add(contribuinte);
      }

      int indice = 1;
      for (Contribuinte item : contribuintes)
      {
         System.out.println();
         System.out.println("Resumo do " + indice + "° contribuinte:");
         System.out.printf("Imposto bruto total: %.2f %n", item.impostoBruto());
         System.out.printf("Abatimento: %.2f %n", item.abatimento());
         System.out.printf("Imposto devido: %.2f", item.impostoLiquido());
         indice++;
         System.out.println();
      }

      scanner.close();
   }
}
