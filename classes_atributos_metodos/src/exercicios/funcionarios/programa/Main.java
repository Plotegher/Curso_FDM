package exercicios.funcionarios.programa;

// Módulo 04 / Capítulo 06 / aula 08 - Classes, atributos, métodos e static
// Exercícios de fixação com POO / Parte 1 / Problema Funcionários

import exercicios.funcionarios.entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Funcionario funcionario = new Funcionario();

      System.out.print("Nome: ");
      funcionario.nome = scanner.nextLine();
      System.out.print("Salário bruto: ");
      funcionario.salarioBruto = scanner.nextDouble();
      System.out.print("Imposto: ");
      funcionario.imposto = scanner.nextDouble();

      System.out.println("Funcionário: " + funcionario);

      System.out.print("Qual a porcentagem para aumentar o salário? ");
      double porcentagem = scanner.nextDouble();
      funcionario.aumentoSalario(porcentagem);

      System.out.println("Dados atualizados: " + funcionario);

      scanner.close();
   }
}
