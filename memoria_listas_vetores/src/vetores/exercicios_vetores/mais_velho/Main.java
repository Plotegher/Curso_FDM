package vetores.exercicios_vetores.mais_velho;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 09 - Mais velho

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantas pessoas você digitará? ");
      int n = scanner.nextInt();

      String[] nomes = new String[n];
      int[] idades = new int[n];

      for (int i = 0; i < n; i++)
      {
         System.out.println("Dados da " + (i + 1) + "ª pessoa:");
         System.out.print("Nome: ");
         scanner.nextLine();
         nomes[i] = scanner.nextLine();
         System.out.print("Idade: ");
         idades[i] = scanner.nextInt();
      }

      int maior = 0;
      String nome = " ";
      for (int i = 0; i < n; i++)
      {
         if (idades[i] > maior)
         {
            maior = idades[i];
            nome = nomes[i];
         }
      }
      System.out.println("PESSOA MAIS VELHA: " + nome);

      scanner.close();
   }
}
