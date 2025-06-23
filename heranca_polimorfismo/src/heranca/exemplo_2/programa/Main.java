package heranca.exemplo_2.programa;

// Módulo 04 / Capítulo 12 / aulas 09 e 10 - Herança e Polimorfismo
// Exemplo: Classes e métodos abstratos

import heranca.exemplo_2.entidades.Circulo;
import heranca.exemplo_2.entidades.Forma;
import heranca.exemplo_2.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(new Locale("pt", "BR"));
      Scanner scanner = new Scanner(System.in);

      System.out.println("Área do retângulo:");
      System.out.print("Lado 1: ");
      double lado_1 = scanner.nextDouble();
      System.out.print("Lado 2: ");
      double lado_2 = scanner.nextDouble();

      // Erro: 'Forma' is abstract; cannot be instantiated
      // Forma forma_0 = new Forma(lado_1, lado_2);

      Forma forma_1 = new Retangulo(lado_1, lado_2);
      System.out.println("Área: " + forma_1.area());

      System.out.println("Área do círculo:");
      System.out.print("Raio: ");
      double raio = scanner.nextDouble();

      Forma forma_2 = new Circulo(raio);
      System.out.println("Área: " + forma_2.area());

      scanner.close();
   }
}
