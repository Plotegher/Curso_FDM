package entrada_dados;

// Módulo 04 / Capítulo 02 / aulas 07 e 08 - Entrada de dados em Java

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(new Locale("pt", "BR"));
      Scanner scanner_BR = new Scanner(System.in);
      Locale.setDefault(Locale.US);
      Scanner scanner_US = new Scanner(System.in);

      System.out.print("Digite um número inteiro: ");
      int inteiro = scanner_BR.nextInt();
      scanner_BR.nextLine(); // Para consumir a quebra de linha
      System.out.print("Digite um nome composto: ");
      String nome = scanner_BR.nextLine();
      System.out.print("Digite um número decimal (com vírgula): ");
      double decimalBr = scanner_BR.nextDouble();
      System.out.print("Digite um número decimal (com ponto): ");
      double decimalUs = scanner_US.nextDouble();
      System.out.print("Digite um caractere: ");
      char caractere = scanner_BR.next().toUpperCase().charAt(0);

      System.out.println();
      System.out.println("Inteiro: " + inteiro);
      System.out.println("String: " + nome);
      System.out.printf("Decimal_BR: %.2f %n", decimalBr);
      System.out.println("Decimal_US: " + decimalUs);
      System.out.println("Caractere: " + caractere);

      scanner_BR.close();
      scanner_US.close();
   }
}
