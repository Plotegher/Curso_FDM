package desafio_atletas;

// Módulo 04 / Capítulo 04 / aula 11 - Desafio Atletas em Java

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      String nome = " ";
      String sexo = " ";
      double peso = 0.0;
      double somaPeso = 0.0;
      double pesoMedio = 0.0;
      double altura = 0.0;
      double alturaAnterior = 0.0;
      String maisAlto = " ";
      double somaHomens = 0.0;
      double porcentagemHomens = 0.0;
      double somaMulheres = 0.0;
      double somaAlturaMulheres = 0.0;
      double alturaMediaMulheres = 0.0;

      System.out.print("Qual a quantidade de atletas? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         System.out.println("Digite os dados do atleta número " + (i + 1) + ":");

         System.out.print("Nome: ");
         scanner.nextLine();
         nome = scanner.nextLine();

         System.out.print("Sexo: ");
         sexo = scanner.next().toUpperCase();

         while (!((sexo.equals("F")) || (sexo.equals("M"))))
         {
            System.out.print("Valor invalido! Favor digitar F ou M: ");
            sexo = scanner.next().toUpperCase();
         }

         // Porcentagem de homens
         if (sexo.equals("M"))
         {
            somaHomens++;
         }
         porcentagemHomens = (somaHomens / n) * 100.0;

         System.out.print("Altura: ");
         altura = scanner.nextDouble();

         while (altura < 0.0001)
         {
            System.out.print("Valor inválido! Favor digitar um valor positivo: ");
            scanner.nextLine();
            altura = scanner.nextDouble();
         }

         // Atleta mais alto
         if (altura > alturaAnterior)
         {
            maisAlto = nome;
         }
         alturaAnterior = altura;

         // Altura média das mulheres
         if (sexo.equals("F"))
         {
            somaAlturaMulheres += altura;
            somaMulheres++;
         }
         alturaMediaMulheres = somaAlturaMulheres / somaMulheres;

         System.out.print("Peso: ");
         peso = scanner.nextDouble();

         while (peso < 0.0001)
         {
            System.out.print("Valor invalido! Favor digitar um valor positivo: ");
            peso = scanner.nextDouble();
         }
         
         // Peso médio dos atletas
         somaPeso += peso;
         pesoMedio = somaPeso / n;
      }

      System.out.println("RELATÓRIO:");
      System.out.printf("Peso médio dos atletas: %.2f %n", pesoMedio);
      System.out.println("Atleta mais alto: " + maisAlto);
      System.out.printf("Porcentagem de homens: %.1f %% %n", porcentagemHomens);
      if (somaMulheres == 0.0)
      {
         System.out.println("Não há mulheres cadastradas");
      }
      else
      {
         System.out.printf("Altura média das mulheres: %.2f %n", alturaMediaMulheres);
      }

      scanner.close();
   }
}
