package listas.exercicio_fixacao.programa;

// Módulo 04 / Capítulo 08 / aula 11 - Memória, vetores e listas
// Exercício de fixação

import listas.exercicio_fixacao.entidades.Funcionario;

import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      List<Funcionario> lista = new ArrayList<>();
      Funcionario funcionario = null;

      System.out.print("Quantos funcionários serão registrados? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         System.out.println();
         System.out.println("Empregado #" + (i + 1) + ":");
         System.out.print("Id: ");
         Integer id = scanner.nextInt();
         while (idExiste(lista, id))
         {
            System.out.println("Esse ID já existe, digite novamente!");
            id = scanner.nextInt();
         }
         System.out.print("Nome: ");
         scanner.nextLine();
         String nome = scanner.nextLine();
         System.out.print("Salário: ");
         Double salario = scanner.nextDouble();
         
         funcionario = new Funcionario(id, nome, salario);

         lista.add(funcionario);
      }

      System.out.print("\nDigite o ID do funcionário que receberá o aumento de salário: ");
      Integer procurado = scanner.nextInt();
      Funcionario encontrado = lista.stream()
            .filter(item -> Objects.equals(item.getId(), procurado))
            .findFirst()
            .orElse(null);

      if (encontrado == null)
      {
         System.out.println("Esse ID não existe!");
      }
      else
      {
         System.out.print("Digite a alíquota de aumento: ");
         Double aliquota = scanner.nextDouble();
         encontrado.aumentaSalario(aliquota);
      }

      System.out.println("\nLista de empregados:");
      for (Funcionario item : lista)
      {
         System.out.println(item);
      }

      scanner.close();
   }

   public static boolean idExiste(List<Funcionario> lista, Integer id)
   {
      Funcionario funcionario = lista.stream()
            .filter(item -> Objects.equals(item.getId(), id))
            .findFirst()
            .orElse(null);
      return funcionario != null;
   }
}
