package exercicio_fixacao.programa;

// Módulo 04 / Capítulo 12 / aulas 11 - Herança e Polimorfismo
// Exercício de fixação

import exercicio_fixacao.entidades.Contribuinte;
import exercicio_fixacao.entidades.Fisica;
import exercicio_fixacao.entidades.Juridica;

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

      System.out.print("Digite o número de contribuintes: ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         System.out.println("\nDados do contribuinte n° " + (i + 1) + ":");

         System.out.print("Pessoa física ou jurídica (F/J)? ");
         char opcao = scanner.next().toUpperCase().charAt(0);

         System.out.print("Nome: ");
         scanner.nextLine();
         String nome = scanner.nextLine();
         System.out.print("Renda anual: ");
         double renda = scanner.nextDouble();

         if (opcao == 'F')
         {
            System.out.print("Despesas de saúde: ");
            double despesas = scanner.nextDouble();
            Contribuinte fisica = new Fisica(nome, renda, despesas);
            contribuintes.add(fisica);
         }

         if (opcao == 'J')
         {
            System.out.print("Número de funcionários: ");
            int empregados = scanner.nextInt();
            Contribuinte juridica = new Juridica(nome, renda, empregados);
            contribuintes.add(juridica);
         }
      }

      System.out.println("\nIMPOSTOS PAGOS:");
      for (Contribuinte c : contribuintes)
      {
         System.out.println(c.getNome() + ": R$ "
               + String.format("%.2f", c.imposto()));
      }

      scanner.close();
   }
}
