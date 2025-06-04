package exercicios.retangulo.programa;

// Módulo 04 / Capítulo 06 / aula 08 - Classes, atributos, métodos e static
// Exercícios de fixação com POO / Parte 1 / Problema Retângulo

import exercicios.retangulo.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Retangulo retangulo = new Retangulo();

      System.out.println("Entre com a altura e largura do retângulo:");
      retangulo.altura = scanner.nextDouble();
      retangulo.largura = scanner.nextDouble();

      System.out.printf("ÁREA = %.2f %n", (retangulo.area()));
      System.out.printf("PERÍMETRO = %.2f %n", (retangulo.perimetro()));
      System.out.printf("DIAGONAL = %.2f %n", (retangulo.diagonal()));

      scanner.close();
   }
}
