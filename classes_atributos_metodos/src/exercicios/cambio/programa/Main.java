package exercicios.cambio.programa;

// Módulo 04 / Capítulo 06 / aula 08 - Classes, atributos, métodos e static
// Exercícios de fixação com POO / Parte 2 / Problema Câmbio

import exercicios.cambio.utilitarios.ConverterMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Qual a cotação do dólar? ");
      ConverterMoeda.cotacao = scanner.nextDouble();

      System.out.print("Quantos dólares serão comprados? ");
      double dolares = scanner.nextDouble();

      double total = ConverterMoeda.dolarParaReal(dolares);
      System.out.printf("Valor a ser pago em reais = %.2f", total);

      scanner.close();
   }
}
