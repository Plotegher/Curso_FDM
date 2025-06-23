package polimorfismo.exemplo.programa;

// Módulo 04 / Capítulo 12 / aulas 06 e 07 - Herança e Polimorfismo
// Exemplo: Polimorfismo

import polimorfismo.exemplo.entidades.Empregado;
import polimorfismo.exemplo.entidades.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o número de colaboradores: ");
      int n = scanner.nextInt();

      List<Empregado> empregados = new ArrayList<>();

      for (int i = 0; i < n; i++)
      {
         System.out.println("\nDados do colaborador n° " + (i + 1) + ":");

         System.out.print("Terceirizado (S/N)? ");
         char terceiro = scanner.next().toUpperCase().charAt(0);

         System.out.print("Nome: ");
         scanner.nextLine();
         String nome = scanner.nextLine();
         System.out.print("Horas: ");
         int horas = scanner.nextInt();
         System.out.print("Valor por hora: ");
         double valor = scanner.nextDouble();

         if (terceiro == 'S')
         {
            System.out.print("Despesa: ");
            double despesa = scanner.nextDouble();
            Empregado terceirizado = new Terceirizado(nome, horas, valor, despesa);
            empregados.add(terceirizado);
         }
         else if (terceiro == 'N')
         {
            Empregado empregado = new Empregado(nome, horas, valor);
            empregados.add(empregado);
         }
      }

      System.out.println("\nPAGAMENTOS:");
      for (Empregado e : empregados)
      {
         System.out.println(e.getNome() + " - R$ " + String.format("%.2f", e.pagamento()));
      }

      scanner.close();
   }
}
