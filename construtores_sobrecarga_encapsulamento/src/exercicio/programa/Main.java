package exercicio.programa;

// Módulo 04 / Capítulo 07 / aulas 08, 09 e 10 - Construtores, this, sobrecarga e encapsulamento
// Exercício de fixação

import exercicio.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o número da conta: ");
      String numero = scanner.next();
      System.out.print("Digite o titular da conta: ");
      scanner.nextLine();
      String titular = scanner.nextLine();

      System.out.print("Haverá um depósito inicial (S ou N)? ");
      char resposta = scanner.next().toUpperCase().charAt(0);
      Conta conta = null;
      if (resposta == 'S')
      {
         System.out.print("Digite o valor do depósito inicial: ");
         double depositoInicial = scanner.nextDouble();
         conta = new Conta(numero, titular, depositoInicial);
         conta.deposito(depositoInicial);
      }
      else
      {
         conta = new Conta(numero, titular);
      }
      System.out.println("\nDados da conta:");
      System.out.println(conta);

      System.out.print("\nDigite um valor de depósito: ");
      double deposito = scanner.nextDouble();
      conta.deposito(deposito);
      System.out.println("Dados atualizados da conta:");
      System.out.println(conta);

      System.out.print("\nDigite um valor de retirada: ");
      double retirada = scanner.nextDouble();
      conta.retirada(retirada);
      System.out.println("Dados atualizados da conta:");
      System.out.println(conta);

      scanner.close();
   }
}
