package repeticao_do_while;

// Módulo 04 / Capítulo 04 / aula 09 - Estrutura repetitiva do-while (faça-enquanto)

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      int opcao;
      do
      {
         System.out.print("Escolha uma opção: ");
         opcao = scanner.nextInt();
         menu(opcao);
      } while (opcao != 0);

      scanner.close();
   }

   public static void menu(int opcao)
   {
      switch (opcao)
      {
         case 1:
         {
            System.out.println("Opção 1");
            break;
         }
         case 2:
         {
            System.out.println("Opção 2");
            break;
         }
         case 3:
         {
            System.out.println("Opção 3");
            break;
         }
         case 0:
         {
            System.out.println("Programa encerrado");
            break;
         }
         default:
         {
            System.out.println("Opção inválida");
            break;
         }
      }
   }
}

