package estrutura_try_catch.exemplo_1;

// Módulo 04 / Capítulo 13 / aula 03 - Tratamento de exceções
// Exemplo 1: Estrutura try-catch

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
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
      }

      System.out.println("Fim do programa!");

      scanner.close();
   }
}
