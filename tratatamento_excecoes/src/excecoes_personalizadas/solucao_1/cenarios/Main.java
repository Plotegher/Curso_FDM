package excecoes_personalizadas.solucao_1.cenarios;

// Módulo 04 / Capítulo 13 / aulas 06 e 07 - Tratamento de exceções
// Solução 1: Exceções personalizadas
// Solução muito ruim / Lógica de validação no programa principal

import excecoes_personalizadas.solucao_1.modelos.entidades.Reserva;

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

         Date agora = new Date();
         if (checkin.before(agora) || checkout.before(agora))
         {
            System.out.println("ERRO NA RESERVA!");
            System.out.println("Para atualização de reservas, as datas devem ser futuras!");
         }
         else if (checkin.after(checkout))
         {
            System.out.println("ERRO NA RESERVA!");
            System.out.println("A data de check-in deve ser anterior a data de check-out!");
         }
         else
         {
            reserva.atualizacao(checkin, checkout);
            System.out.println("Reserva: " + reserva);
         }
      }
      scanner.close();
   }
}
