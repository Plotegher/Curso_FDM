package exercicios.notas;

// Módulo 04 / Capítulo 03 / aula 05 - Exercícios sobre estruturas condicionais em Java
// Exercício 01 - Notas

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a primeira nota: ");
      double nota1 = scanner.nextDouble();
      System.out.print("Digite a segunda nota: ");
      double nota2 = scanner.nextDouble();

      double media = nota1 + nota2;
      System.out.println("NOTA FINAL = " + media);

      if (media < 60.0)
      {
         System.out.println("REPROVADO");
      }

      scanner.close();
   }
}
