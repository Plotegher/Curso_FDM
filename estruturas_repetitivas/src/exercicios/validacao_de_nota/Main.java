package exercicios.validacao_de_nota;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 05 - Validação de nota

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a primeira nota: ");
      double nota1 = scanner.nextDouble();

      while (!(intervalo(nota1)))
      {
         System.out.print("Valor inválido! Digite novamente: ");
         nota1 = scanner.nextDouble();
      }

      System.out.print("Digite a segunda nota: ");
      double nota2 = scanner.nextDouble();

      while (!(intervalo(nota2)))
      {
         System.out.print("Valor inválido! Digite novamente: ");
         nota2 = scanner.nextDouble();
      }

      double media = (nota1 + nota2) / 2;
      System.out.printf("MÉDIA = %.2f", media);

      scanner.close();
   }

   public static boolean intervalo(double nota)
   {
      return nota >= 0.0 && nota <= 10.0;
   }
}
