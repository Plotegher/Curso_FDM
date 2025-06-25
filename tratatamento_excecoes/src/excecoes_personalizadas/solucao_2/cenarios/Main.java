package excecoes_personalizadas.solucao_2.cenarios;

// Módulo 04 / Capítulo 13 / aula 08 - Tratamento de exceções
// Solução 2: Exceções personalizadas
// Solução ruim / Método retornando String

import excecoes_personalizadas.solucao_2.modelos.entidades.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args) throws ParseException
   {
      Scanner scanner = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      System.out.print("Número do quarto: ");
      int quarto = scanner.nextInt();
      System.out.print("Data de check-in (DD/MM/YYYY): ");
      Date checkin = sdf.parse(scanner.next());
      System.out.print("Data de check-out (DD/MM/YYYY): ");
      Date checkout = sdf.parse(scanner.next());

      if (checkin.after(checkout))
      {
         System.out.println("A data de check-in deve ser anterior a data de check-out!");
      }
      else
      {
         Reserva reserva = new Reserva(quarto, checkin, checkout);
         System.out.println("Reserva: " + reserva);
         System.out.println();

         System.out.println("Digite os dados para atualização da reserva:");
         System.out.print("Data de check-in (DD/MM/YYYY): ");
         checkin = sdf.parse(scanner.next());
         System.out.print("Data de check-out (DD/MM/YYYY): ");
         checkout = sdf.parse(scanner.next());

         String erro = reserva.atualizacao(checkin, checkout);
         if (erro != null)
         {
            System.out.println(erro);
         }
         else
         {
            System.out.println("Reserva: " + reserva);
         }
      }
      scanner.close();
   }
}
