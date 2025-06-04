package membros_estaticos.programa;

// Módulo 04 / Capítulo 06 / aulas 09 e 10 - Classes, atributos, métodos e static
// Membros estáticos

import membros_estaticos.utilitarios.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o valor do raio: ");
      double raio = scanner.nextDouble();

      double circunferencia = Calculadora.circunferencia(raio);
      double volume = Calculadora.volume(raio);

      System.out.printf("Circunferência: %.2f %n", circunferencia);
      System.out.printf("Volume: %.2f %n", volume);
      System.out.printf("Valor de PI: %.2f", Calculadora.PI);

      scanner.close();
   }
}
