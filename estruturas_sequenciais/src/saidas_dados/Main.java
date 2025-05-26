package saidas_dados;

// Módulo 04 / Capítulo 02 / aula 05 - Saídas de dados em Java

import java.util.Locale;

public class Main
{
   public static void main(String[] args)
   {
      //Locale.setDefault(Locale.US);

      String nome = "Teste";
      int idade = 35;
      double altura = 1.94;

      String produto1 = "Computador";
      String produto2 = "Mesa";

      int codigo = 5290;
      char genero = 'M';

      double preco1 = 2100.0;
      double preco2 = 650.50;
      double medida = 53.234567;


      System.out.print("\nSystem.out.print não salta linha");
      System.out.println("\nSystem.out.println salta linha");
      System.out.printf("\nSystem.out.printf permite multi-formatação");

      System.out.println("\nprintf recebe argumento(s) e valor(es)");
      System.out.println("%.s formata uma string");
      System.out.println("%.d formata um número inteiro");
      System.out.println("%.nf formata um número de ponto flutuante com n casas de precisão");
      System.out.printf("Nome: %s, Idade: %d, Altura: %.2f", nome, idade, altura);

      System.out.println();
      System.out.printf("%s, preço = R$ %.2f %n" , produto1, preco1);
      System.out.printf("%s, preço = R$ %.2f %n", produto2, preco2);
      System.out.printf("Registro: %d anos, código %d e gênero %s %n", idade, codigo, genero);
      System.out.printf("Medida com 8 casas decimais: %.8f %n", medida);
      System.out.printf("Arredondamento (3 casas decimais): %.3f %n", medida);
      Locale.setDefault(Locale.US);
      System.out.printf("Ponto decimal americano: %.3f %n", medida);
   }
}
