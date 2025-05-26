package exercicios.terreno;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 01 - Terreno

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a largura do terreno: ");
      double largura = scanner.nextDouble(); // 10.0
      System.out.print("Digite o comprimento do terreno: ");
      double comprimento = scanner.nextDouble(); // 30.0
      System.out.print("Digite o valor do metro quadrado: ");
      double preco = scanner.nextDouble(); // 200.0

      double area = largura * comprimento;
      System.out.printf("Área do terreno = M² %.2f", area); // 300.00
      double total = area * preco;
      System.out.printf("\nPreço do terreno = R$ %.2f", total); // 60000.00

      scanner.close();
   }
}
