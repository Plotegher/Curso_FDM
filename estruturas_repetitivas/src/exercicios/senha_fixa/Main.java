package exercicios.senha_fixa;

// Módulo 04 / Capítulo 04 / aula 10 - Exercícios sobre estruturas repetitivas em Java
// Exercício 03 - Senha fixa

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a senha: ");
      int senha = scanner.nextInt();

      while (senha != 2002)
      {
         System.out.print("Senha inválida! Tente novamente: ");
         senha = scanner.nextInt();
      }
      System.out.println("Acesso permitido!");

      scanner.close();
   }
}
