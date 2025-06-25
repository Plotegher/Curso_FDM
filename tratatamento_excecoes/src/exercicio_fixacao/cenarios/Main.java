package exercicio_fixacao.cenarios;

// Módulo 04 / Capítulo 13 / aula 10 - Tratamento de exceções
// Exercício de fixação

import exercicio_fixacao.modelos.entidades.Conta;
import exercicio_fixacao.modelos.excecoes.LimiteException;
import exercicio_fixacao.modelos.excecoes.SaldoException;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      try
      {
         System.out.println("\nDigite os dados da conta:");
         System.out.print("Número: ");
         int numero = scanner.nextInt();
         System.out.print("Titular: ");
         scanner.nextLine();
         String nome = scanner.nextLine();
         System.out.print("Saldo inicial: ");
         double saldo = scanner.nextDouble();
         System.out.print("Limite de saque: ");
         double limite = scanner.nextDouble();

         Conta conta = new Conta(numero, nome, saldo, limite);

         System.out.print("\nDigite o valor para saque: ");
         conta.saque(scanner.nextDouble());
         System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
      }
      catch (LimiteException | SaldoException e)
      {
         System.out.println(e.getMessage());
      }

      scanner.close();
   }
}
