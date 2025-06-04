package desafio_bar_poo.programa;

// Módulo 04 / Capítulo 04 / aula 11 - Desafio Bar em Java - POO

import desafio_bar_poo.entidades.Conta;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Conta conta = new Conta();

      System.out.print("Sexo (F ou M): ");
      conta.genero = scanner.next().toUpperCase().charAt(0);

      System.out.print("Quantidade de cervejas: ");
      conta.cerveja = scanner.nextInt();
      System.out.print("Quantidade de refrigerantes: ");
      conta.refrigerante = scanner.nextInt();
      System.out.print("Quantidade de espetinhos: ");
      conta.espetinho = scanner.nextInt();

      System.out.println("\nRELATÓRIO: ");
      System.out.printf("Consumo = R$ %.2f %n", conta.consumo());
      if (conta.couvert() > 0.0)
      {
         System.out.printf("Couvert = R$ %.2f %n", conta.couvert());
      }
      else
      {
         System.out.println("Isento de Couvert");
      }
      System.out.printf("Ingresso = R$ %.2f %n", conta.ingresso());

      System.out.printf("\nValor a pagar = R$ %.2f", conta.total());

      scanner.close();
   }
}
