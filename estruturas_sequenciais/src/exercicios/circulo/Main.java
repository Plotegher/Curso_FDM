package exercicios.circulo;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 06 - Círculo

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o valor do raio do círculo: ");
      double raio = scanner.nextDouble();

      double area = Math.PI * (Math.pow(raio, 2));
      System.out.printf("ÁREA = %.3f", area);
   }
}
