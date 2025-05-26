package exercicios.medidas;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 09 - Medidas

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a medida A: ");
      double a = scanner.nextDouble();
      System.out.print("Digite a medida B: ");
      double b = scanner.nextDouble();
      System.out.print("Digite a medida C: ");
      double c = scanner.nextDouble();

      double quadrado = a * a;
      double triangulo = (a * b) / 2.0;
      double trapezio = ((a + b) * c) / 2.0;

      System.out.printf("ÁREA DO QUADRADO: %.4f %n", quadrado);
      System.out.printf("ÁREA DO TRIÂNGULO: %.4f %n", triangulo);
      System.out.printf("ÁREA DO TRAPÉZIO: %.4f %n", trapezio);

      scanner.close();
   }
}
