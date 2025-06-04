package introducao.programa;

// Módulo 04 / Capítulo 06 / aula 02 - Classes, atributos, métodos e static
// Resolução de problema sem orientação a objetos

import java.util.Locale;
import java.util.Scanner;

public class sem_poo
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite as medidas do triângulo 1:");
      double a1 = scanner.nextDouble();
      double b1 = scanner.nextDouble();
      double c1 = scanner.nextDouble();

      double p1 = (a1 + b1 + c1) / 2;
      double area1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));

      System.out.println("Digite as medidas do triângulo 2:");
      double a2 = scanner.nextDouble();
      double b2 = scanner.nextDouble();
      double c2 = scanner.nextDouble();

      double p2 = (a2 + b2 + c2) / 2;
      double area2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

      String resultado = (area1 > area2) ? "Área 1" : "Área 2";

      System.out.println("A maior área é: " + resultado);

      scanner.close();
   }
}
