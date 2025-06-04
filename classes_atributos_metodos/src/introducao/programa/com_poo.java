package introducao.programa;

// Módulo 04 / Capítulo 06 / aulas 03 e 04 - Classes, atributos, métodos e static
// Resolução de problema com orientação a objetos

import introducao.entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class com_poo
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Triangulo triangulo1, triangulo2;
      triangulo1 = new Triangulo();
      triangulo2 = new Triangulo();

      System.out.println("Digite as medidas do triângulo 1:");
      triangulo1.lado1 = scanner.nextDouble();
      triangulo1.lado2 = scanner.nextDouble();
      triangulo1.lado3 = scanner.nextDouble();

      System.out.println("Digite as medidas do triângulo 2:");
      triangulo2.lado1 = scanner.nextDouble();
      triangulo2.lado2 = scanner.nextDouble();
      triangulo2.lado3 = scanner.nextDouble();

      double area1 = triangulo1.area();
      double area2 = triangulo2.area();

      System.out.printf("Área do triângulo 1: %.4f %n", area1);
      System.out.printf("Área do triângulo 2: %.4f %n", area2);

      String resultado = (area1 > area2) ? "Área 1" : "Área 2";

      System.out.println("A maior área é: " + resultado);

      scanner.close();
   }
}
