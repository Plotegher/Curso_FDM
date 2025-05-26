package exercicios.consumo;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 08 - Consumo

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Distância percorrida: ");
      double distancia = scanner.nextDouble();
      System.out.print("Combustível gasto: ");
      double combustivel = scanner.nextDouble();

      double consumo = distancia / combustivel;
      System.out.printf("Consumo médio: %.3f", consumo);

      scanner.close();
   }
}
