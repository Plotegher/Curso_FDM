package generics.exemplo_1.programa;

// Módulo 04 / Capítulo 16 / aula 02 - Generics, Set e Map
// Exemplo 1: Sem reuso porque a classe ServicoImpressao só aceita tipo Integer

import generics.exemplo_1.servicos.ServicoImpressao;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      ServicoImpressao servico = new ServicoImpressao();

      System.out.print("Quantos valores serão digitados? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         int valor = scanner.nextInt();
         servico.adicionaValor(valor);
      }

      servico.imprimir();
      System.out.println("Primeiro: " + servico.primeiro());

      scanner.close();
   }
}
