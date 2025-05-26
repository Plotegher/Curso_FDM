package exercicios.idades;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 03 - Idades

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Dados da primeira pessoa:");
      System.out.print("Nome: ");
      String nome1 = scanner.nextLine();
      System.out.print("Idade: ");
      double idade1 = scanner.nextDouble();

      scanner.nextLine();
      System.out.println("Dados da segunda pessoa:");
      System.out.print("Nome: ");
      String nome2 = scanner.nextLine();
      System.out.print("Idade: ");
      double idade2 = scanner.nextDouble();

      double media = (idade1 + idade2) / 2.0;
      System.out.printf("A idade média de " + nome1 + " e "
            + nome2 + " é de " + media + " anos.");

      scanner.close();
   }
}
