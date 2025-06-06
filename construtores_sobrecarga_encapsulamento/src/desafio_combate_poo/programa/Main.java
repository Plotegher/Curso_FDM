package desafio_combate_poo.programa;

// Módulo 04 / Capítulo 07 / aula 11 - Construtores, this, sobrecarga e encapsulamento
// Desafio Combate POO

import desafio_combate_poo.entidades.Campeao;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite os dados do primeiro campeão:");
      System.out.print("Nome: ");
      String nomeA = scanner.nextLine();
      System.out.print("Vida inicial: ");
      int vidaA = scanner.nextInt();
      System.out.print("Ataque: ");
      int ataqueA = scanner.nextInt();
      System.out.print("Armadura: ");
      int armaduraA = scanner.nextInt();

      System.out.println("\nDigite os dados do segundo campeão:");
      System.out.print("Nome: ");
      scanner.nextLine();
      String nomeB = scanner.nextLine();
      System.out.print("Vida inicial: ");
      int vidaB = scanner.nextInt();
      System.out.print("Ataque: ");
      int ataqueB = scanner.nextInt();
      System.out.print("Armadura: ");
      int armaduraB = scanner.nextInt();

      Campeao campeaoA = new Campeao(nomeA, vidaA, ataqueA, armaduraA);
      Campeao campeaoB = new Campeao(nomeB, vidaB, ataqueB, armaduraB);

      System.out.print("\nQuantos turnos você pretende executar? ");
      int turnos = scanner.nextInt();

      for (int i = 0; i < turnos; i++)
      {
         campeaoA.receberDano(campeaoB);
         campeaoB.receberDano(campeaoA);
         System.out.println("\nResultado do turno " + (i + 1) + ":");
         System.out.println(campeaoA.status());
         System.out.println(campeaoB.status());

         if (campeaoA.getVida() == 0 || campeaoB.getVida() == 0)
         {
            break;
         }
      }

      System.out.println("\nFIM DO COMBATE");

      scanner.close();
   }
}
