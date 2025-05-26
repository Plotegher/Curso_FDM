package exercicios.pagamento;

// Módulo 04 / Capítulo 02 / aula 10 - Exercícios sobre estruturas sequenciais em Java
// Exercício 07 - Pagamento

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Nome: ");
      String nome = scanner.nextLine();
      System.out.print("Valor por hora: ");
      double valor = scanner.nextDouble();
      System.out.print("Horas trabalhadas: ");
      double horas = scanner.nextDouble();

      double calculo = valor * horas;
      System.out.printf("O pagamento para %s deve ser %.2f", nome, calculo);

      scanner.close();
   }
}
