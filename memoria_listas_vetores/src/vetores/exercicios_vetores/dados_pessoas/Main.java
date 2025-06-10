package vetores.exercicios_vetores.dados_pessoas;

// Módulo 04 / Capítulo 08 / aula 06 - Memória, vetores e listas
// Exercício 11 - Dados de pessoas

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Quantas pessoas serão digitadas? ");
      int n = scanner.nextInt();

      double[] alturas = new double[n];
      char[] generos = new char[n];

      for (int i = 0; i < n; i++)
      {
         System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
         alturas[i] = scanner.nextDouble();
         System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
         generos[i] = scanner.next().toUpperCase().charAt(0);
      }

      double menor = 10.0;
      for (double altura : alturas)
      {
         if (altura < menor)
         {
            menor = altura;
         }
      }
      System.out.println("Menor altura = " + menor);

      double maior = 0.0;
      for (double altura : alturas)
      {
         if (altura > maior)
         {
            maior = altura;
         }
      }
      System.out.println("Maior altura = " + maior);

      double soma = 0.0;
      int homens = 0;
      int mulheres = 0;
      for (int i = 0; i < n; i++)
      {
         if (generos[i] == 'F')
         {
            soma += alturas[i];
            mulheres++;
         }
         if (generos[i] == 'M')
         {
            homens++;
         }
      }
      System.out.printf("Média das alturas das mulheres = %.2f %n", soma / mulheres);
      System.out.println("Número de homens: " + homens);

      scanner.close();
   }
}
