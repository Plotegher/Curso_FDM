package exercicios.tempo_de_jogo;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 12 - Tempo de jogo

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Hora inicial: ");
      int horaInicial = scanner.nextInt();
      System.out.print("Hora final: ");
      int horaFinal = scanner.nextInt();

      int duracao = 0;
      if (horaInicial > horaFinal)
      {
         duracao = (horaFinal + 24) - horaInicial;
      }
      else if (horaInicial < horaFinal)
      {
         duracao = horaFinal - horaInicial;
      }
      else
      {
         duracao = 24;
      }
      System.out.printf("O JOGO DUROU %d HORAS(S)", duracao);

      scanner.close();
   }
}
