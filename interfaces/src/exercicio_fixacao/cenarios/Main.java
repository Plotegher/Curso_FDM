package exercicio_fixacao.cenarios;

// Módulo 04 / Capítulo 15 / aulas 07, 08 e 09 - Interfaces
// Exercício de fixação

import exercicio_fixacao.modelos.entidades.Contrato;
import exercicio_fixacao.modelos.entidades.Parcela;
import exercicio_fixacao.modelos.servicos.PagamentoPayPal;
import exercicio_fixacao.modelos.servicos.ServicoContrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.println("\nDigite os dados do contrato:");
      System.out.print("Número: ");
      int numero = scanner.nextInt();
      System.out.print("Data (DD/MM/YYYY): ");
      LocalDate data = LocalDate.parse(scanner.next(), dtf);
      System.out.print("Valor do contrato: ");
      double valorTotal = scanner.nextDouble();

      Contrato contrato = new Contrato(numero, data, valorTotal);

      System.out.print("Número de parcelas: ");
      int parcelas = scanner.nextInt();

      ServicoContrato servicoContrato = new ServicoContrato(new PagamentoPayPal());
      servicoContrato.processaContrato(contrato, parcelas);

      System.out.println("\nParcelas:");
      for (Parcela p : contrato.getParcelas())
      {
         System.out.println(p);
      }
      System.out.println("Total: R$ " + String.format("%.2f", contrato.somaParcelas()));

      scanner.close();
   }
}
