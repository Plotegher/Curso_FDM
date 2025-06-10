package vetores.exercicios_vetores.aprovados;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 10 - Aprovados

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantos alunos serão digitados? ");
      int n = scanner.nextInt();

      String[] nomes = new String[n];
      double[] notas1 = new double[n];
      double[] notas2 = new double[n];

      for (int i = 0; i < n; i++)
      {
         System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "° aluno:");
         scanner.nextLine();
         nomes[i] = scanner.nextLine();
         notas1[i] = scanner.nextDouble();
         notas2[i] = scanner.nextDouble();
      }

      double[] medias = new double[n];
      for (int i = 0; i < n; i++)
      {
         medias[i] = (notas1[i] + notas2[i]) / 2.0;
      }

      System.out.println("\nAlunos aprovados:");
      for (int i = 0; i < n; i++)
      {
         if (medias[i] >= 6.0)
         {
            System.out.println(nomes[i]);
         }
      }
      scanner.close();
   }
}
