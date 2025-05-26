package exercicios.troco;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 05 - Troco

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Preço unitário do produto: ");
      double preco = scanner.nextDouble();
      System.out.print("Quantidade comprada: ");
      double quantidade = scanner.nextDouble();
      System.out.print("Dinheiro recebido: ");
      double recebido = scanner.nextDouble();

      double total = preco * quantidade;
      double troco = recebido - total;
      System.out.printf("TROCO = %.2f", troco);

      scanner.close();
   }
}
