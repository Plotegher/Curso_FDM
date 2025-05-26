package exercicios.retangulo;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 02 - Retângulo

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Base do retângulo: ");
      double base = scanner.nextDouble();
      System.out.print("Altura do retângulo: ");
      double altura = scanner.nextDouble();

      double area = base * altura;
      double perimetro = (2 * base) + (2 * altura);
      double diagonal = Math.sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));

      System.out.printf("ÁREA = %.4f %n", area);
      System.out.printf("PERÍMETRO = %.4f %n", perimetro);
      System.out.printf("DIAGONAL = %.4f", diagonal);

      scanner.close();
   }
}
