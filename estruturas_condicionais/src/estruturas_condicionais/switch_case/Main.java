package estruturas_condicionais.switch_case;

// Módulo 04 / Capítulo 03 / aula 07 - Estruturas condicionais em Java
// Condicional switch-case

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("1 - Domingo");
      System.out.println("2 - Segunda");
      System.out.println("3 - Terça");
      System.out.println("4 - Quarta");
      System.out.println("5 - Quinta");
      System.out.println("6 - Sexta");
      System.out.println("7 - Sábado");
      System.out.print("Digite uma opção: ");
      int opcao = scanner.nextInt();

      switch (opcao)
      {
         case 1:
         {
            System.out.println("DOMINGO");
            break;
         }
         case 2:
         {
            System.out.println("SEGUNDA");
            break;
         }
         case 3:
         {
            System.out.println("TERÇA");
            break;
         }
         case 4:
         {
            System.out.println("QUARTA");
            break;
         }
         case 5:
         {
            System.out.println("QUINTA");
            break;
         }
         case 6:
         {
            System.out.println("SEXTA");
            break;
         }
         case 7:
         {
            System.out.println("SÁBADO");
            break;
         }
         default:
         {
            System.out.println("INVÁLIDO");
            break;
         }
      }

      scanner.close();
   }
}
