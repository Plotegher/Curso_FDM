package exemplo_1.cenarios;

// Módulo 04 / Capítulo 15 / aulas 02, 03 e 04 - Interfaces
// Exemplo 1: Solução sem interface

import exemplo_1.modelos.entidades.Locacao;
import exemplo_1.modelos.entidades.Veiculo;
import exemplo_1.modelos.servicos.ImpostoBrasil;
import exemplo_1.modelos.servicos.ServicoLocacao;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args) throws ParseException
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

      System.out.println("\nDigite os dados da locação:");
      System.out.print("Modelo do carro: ");
      String modelo = scanner.nextLine();
      System.out.print("Retirada (DD/MM/YYYY HH/MM): ");
      LocalDateTime retirada = LocalDateTime.parse(scanner.nextLine(), dtf);
      System.out.print("Devolução (DD/MM/YYYY HH/MM): ");
      LocalDateTime devolucao = LocalDateTime.parse(scanner.nextLine(), dtf);

      Locacao locacao = new Locacao(retirada, devolucao, new Veiculo(modelo));

      System.out.print("Preço por hora: ");
      double porHora = scanner.nextDouble();
      System.out.print("Preço por dia: ");
      double porDia = scanner.nextDouble();

      ServicoLocacao servicoLocacao = new ServicoLocacao(porHora, porDia, new ImpostoBrasil());

      servicoLocacao.faturamento(locacao);

      System.out.println("\nFATURA DE LOCAÇÃO:");
      System.out.println("Tarifa básica: " + String.format("%.2f", locacao.getFatura().getTarifa()));
      System.out.println("Impostos: " + String.format("%.2f", locacao.getFatura().getImposto()));
      System.out.println("Total da fatura: " + String.format("%.2f", locacao.getFatura().getTotal()));

      scanner.close();
   }
}
