package generics.exemplo_2.programa;

// Módulo 04 / Capítulo 16 / aula 02 - Generics, Set e Map
// Exemplo 2: Com reuso utilizando um tipo generics na
// classe ServicoImpressao.

import generics.exemplo_2.servicos.ServicoImpressao;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      //ServicoImpressao<Integer> servico = new ServicoImpressao();
      ServicoImpressao<String> servico = new ServicoImpressao();

      System.out.print("Quantos valores serão digitados? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         //int valor = scanner.nextInt();
         String valor = scanner.next();
         servico.adicionaValor(valor);
      }

      servico.imprimir();
      System.out.println("Primeiro: " + servico.primeiro());

      scanner.close();
   }
}
