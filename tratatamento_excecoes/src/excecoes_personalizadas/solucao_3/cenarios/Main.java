package excecoes_personalizadas.solucao_3.cenarios;

// Módulo 04 / Capítulo 13 / aula 08 - Tratamento de exceções
// Solução 3: Exceções personalizadas
// Solução boa / Tratamento de exceções

import excecoes_personalizadas.solucao_3.modelos.entidades.Reserva;
import excecoes_personalizadas.solucao_3.modelos.excecoes.ExcecaoDominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      try
      {
         System.out.print("Número do quarto: ");
         int quarto = scanner.nextInt();
         System.out.print("Data de check-in (DD/MM/YYYY): ");
         Date checkin = sdf.parse(scanner.next());
         System.out.print("Data de check-out (DD/MM/YYYY): ");
         Date checkout = sdf.parse(scanner.next());

         Reserva reserva = new Reserva(quarto, checkin, checkout);
         System.out.println("Reserva: " + reserva);

         System.out.println("\nDigite os dados para atualização da reserva:");
         System.out.print("Data de check-in (DD/MM/YYYY): ");
         checkin = sdf.parse(scanner.next());
         System.out.print("Data de check-out (DD/MM/YYYY): ");
         checkout = sdf.parse(scanner.next());

         reserva.atualizacao(checkin, checkout);
         System.out.println("Reserva: " + reserva);
      }
      catch (ParseException e)
      {
         System.out.println("Formato de data inválido!");
      }
      catch (ExcecaoDominio e)
      {
         System.out.println(e.getMessage());
      }
      catch (InputMismatchException e)
      {
         System.out.println("Digite um número de quarto válido!");
      }
      catch (RuntimeException e)
      {
         System.out.println("Erro inesperado!");
      }
      scanner.close();
   }
}
