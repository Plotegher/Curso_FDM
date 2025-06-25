package estrutura_try_catch.exemplo_2;

// Módulo 04 / Capítulo 13 / aula 04 - Tratamento de exceções
// Exemplo 2: Pilha de chamadas de métodos (stack trace)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      metodoAuxiliar1();
      System.out.println("Fim do programa!");
   }

   public static void metodoAuxiliar1()
   {
      System.out.println("Início do método auxiliar 1!");
      metodoAuxiliar2();
      System.out.println("Fim do método auxiliar 1!");
   }

   public static void metodoAuxiliar2()
   {
      System.out.println("Início do método auxiliar 2!");
      Scanner scanner = new Scanner(System.in);

      try
      {
         // Um vetor recebe dados digitados em uma linha,
         // separados por um espaço em branco.
         String[] vetor = scanner.nextLine().split(" ");

         // Leitura de uma variável posição.
         int posicao = scanner.nextInt();

         // Mostra em tela o elemento do vetor na posição informada
         System.out.println(vetor[posicao]);
      }
      catch (InputMismatchException e)
      {
         // Trata uma entrada inválida para a variável posicao
         System.out.println("Valor inválido!");
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
         // Trata uma posição inexistente do vetor
         System.out.println("Posição inválida!");
         // Imprime a pilha de rastreamento da exceção
         e.printStackTrace();
      }
      System.out.println("Fim do método auxiliar 2!");
      scanner.close();
   }
}
