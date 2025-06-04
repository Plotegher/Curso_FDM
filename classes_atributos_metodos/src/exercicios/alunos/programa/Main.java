package exercicios.alunos.programa;

// Módulo 04 / Capítulo 06 / aula 08 - Classes, atributos, métodos e static
// Exercícios de fixação com POO / Parte 1 / Problema Alunos

import exercicios.alunos.entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Aluno aluno = new Aluno();

      System.out.print("Digite o nome do aluno: ");
      aluno.nome = scanner.nextLine();
      System.out.println("Digite as 3 notas do aluno:");
      aluno.nota1 = scanner.nextDouble();
      aluno.nota2 = scanner.nextDouble();
      aluno.nota3 = scanner.nextDouble();

      System.out.printf("NOTA FINAL = %.2f %n", aluno.notaFinal());
      aluno.aprovacao();

      scanner.close();
   }
}
