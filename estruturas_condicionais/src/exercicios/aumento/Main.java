package exercicios.aumento;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 11 - Aumento

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o salário da pessoa: ");
      double salario = scanner.nextDouble();

      double salarioInicial = salario;
      double porcentagem = 0.0;
      if (salario <= 1000.0)
      {
         porcentagem = 20.0;
         salario += salario * (porcentagem / 100);
      }
      else if (salario > 1000.0 && salario <= 3000.0)
      {
         porcentagem = 15.0;
         salario += salario * (porcentagem / 100);
      }
      else if (salario > 3000.0 && salario <= 8000.0)
      {
         porcentagem = 10.0;
         salario += salario * (porcentagem / 100);
      }
      else
      {
         porcentagem = 5.0;
         salario += salario * (porcentagem / 100);
      }

      System.out.printf("Novo salário = R$ %.2f %n", salario);
      System.out.printf("Aumento = R$ %.2f %n", (salario - salarioInicial));
      System.out.printf("Porcentagem = %d %s", (int) porcentagem, "%");

      scanner.close();
   }
}
