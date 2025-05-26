package exercicios.duracao;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 10 - Duração

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a duração em segundos: ");
      int valor = scanner.nextInt();

      int horas = valor / 3600;
      int restoHoras = valor % 3600;

      int minutos = restoHoras / 60;

      int segundos = restoHoras % 60;

      System.out.println(horas + ":" + minutos + ":" + segundos);

      scanner.close();
   }
}
