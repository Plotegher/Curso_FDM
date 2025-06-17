package desafio_empregados_poo.programa;

// Módulo 04 / Capítulo 11 / aula 09 - Enumeração e Composição
// Desafio Empregados POO

import desafio_empregados_poo.entidades.Departamento;
import desafio_empregados_poo.entidades.Empregado;
import desafio_empregados_poo.entidades.Endereco;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("\nNome do departamento: ");
      String nomeDepartamento = scanner.nextLine();
      System.out.print("Dia do pagamento: ");
      int dia = scanner.nextInt();
      System.out.print("E-mail: ");
      scanner.nextLine();
      String email = scanner.nextLine();
      System.out.print("Telefone: ");
      String telefone = scanner.nextLine();

      Endereco endereco = new Endereco(email, telefone);
      Departamento departamento = new Departamento(nomeDepartamento, dia, endereco);

      System.out.print("\nQuantos funcionários tem o departamento? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         System.out.println("\nDados do funcionário " + (i + 1) + ":");
         System.out.print("Nome: ");
         scanner.nextLine();
         String nomeEmpregado = scanner.nextLine();
         System.out.print("Salário: ");
         double salario = scanner.nextDouble();

         Empregado empregado = new Empregado(nomeEmpregado, salario);
         departamento.adicionarEmpregado(empregado);
      }
      mostrarRelatorio(departamento);

      scanner.close();
   }

   private static void mostrarRelatorio(Departamento departamento)
   {
      System.out.println(departamento.toString());
   }
}
