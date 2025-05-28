package desafio_imposto;

// Módulo 04 / Capítulo 03 / aula 10 - Desafio Imposto em Java

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("\nRenda anual com salário: ");
      double salario = scanner.nextDouble();
      System.out.print("Renda anual com prestação de serviços: ");
      double servico = scanner.nextDouble();
      System.out.print("Renda anual com ganho de capital: ");
      double capital = scanner.nextDouble();
      System.out.print("Gastos médicos: ");
      double medico = scanner.nextDouble();
      System.out.print("Gastos educacionais: ");
      double educacao = scanner.nextDouble();

      // Imposto sobre salário

      double impostoSalario = 0.0;
      if (salario < 36000.0)
      {
         impostoSalario = 0.0;
      }
      else if (salario >= 36000.0 && salario < 60000.0)
      {
         impostoSalario = salario * 0.10;
      }
      else
      {
         impostoSalario = salario * 0.20;
      }

      // Imposto sobre serviços

      double impostoServico = 0.0;
      if (servico != 0.0)
      {
         impostoServico = servico * 0.15;
      }

      // Imposto sobre ganhos de capital

      double impostoCapital = 0.0;
      if (capital > 0.0)
      {
         impostoCapital = capital * 0.20;
      }

      // Deduções

      double impostoTotal = impostoSalario + impostoServico + impostoCapital;
      double impostoBrutoTotal = 0.0;
      double gastosDedutiveis = medico + educacao;
      double maximoDedutivel = impostoTotal * 0.30;
      if (gastosDedutiveis < maximoDedutivel)
      {
         impostoBrutoTotal = medico + educacao;
      }
      else
      {
         impostoBrutoTotal = impostoTotal * 0.30;
      }

      // Relatório

      System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA");
      System.out.println("\nCONSOLIDADO DE RENDA:");
      System.out.printf("Imposto sobre salário: %.2f %n", impostoSalario);
      System.out.printf("Imposto sobre serviços: %.2f %n", impostoServico);
      System.out.printf("Imposto sobre ganho de capital: %.2f %n", impostoCapital);
      System.out.println("\nDEDUÇÕES:");
      System.out.printf("Máximo dedutível: %.2f %n", maximoDedutivel);
      System.out.printf("Gastos dedutíveis: %.2f %n", gastosDedutiveis);
      System.out.println("\nRESUMO:");
      System.out.printf("Imposto bruto total: %.2f %n", impostoTotal);
      System.out.printf("Abatimento: %.2f %n", impostoBrutoTotal);
      System.out.printf("Imposto devido: %.2f", impostoTotal - impostoBrutoTotal);

      scanner.close();
   }
}
