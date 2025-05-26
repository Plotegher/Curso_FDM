package exercicios.soma;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 04 - Soma

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o valor de X: ");
      int x = scanner.nextInt();
      System.out.print("Digite o valor de Y: ");
      int y = scanner.nextInt();

      int soma = x + y;
      System.out.println("SOMA = " + soma);

      scanner.close();
   }
}
