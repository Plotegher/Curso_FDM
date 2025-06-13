package operacoes.exemplo_1;

// Módulo 04 / Capítulo 10 / aula 05 - Trabalhando com datas e horas
// Exemplo 1

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main
{
   public static void main(String[] args)
   {
      // Instanciação a partir do (Agora) -> data-hora

      System.out.println();
      System.out.println("1.1) Instanciação a partir de agora (now) -> data-hora");
      System.out.println("-------------------------------------------------------------------------");

      LocalDate localDate1 = LocalDate.now();
      System.out.println("LocalDate.now(): " + localDate1);

      LocalDateTime localDateTime1 = LocalDateTime.now();
      System.out.println("LocalDateTime.now(): " + localDateTime1);

      Instant instant1 = Instant.now();
      System.out.println("Instant.now(): " + instant1);

      // Instanciação de texto ISO 8601 -> data-hora

      System.out.println();
      System.out.println("1.2) Instanciação de texto ISO 8601 -> data-hora");
      System.out.println("-------------------------------------------------------------------------");

      LocalDate localDate2 = LocalDate.parse("2025-06-12");
      System.out.println("LocalDate.parse(texto): " + localDate2);

      LocalDateTime localDateTime2 = LocalDateTime.parse("2025-06-12T11:11:11");
      System.out.println("LocalDateTime.parse(texto): " + localDateTime2);

      Instant instant2 = Instant.parse("2025-06-12T11:11:11Z");
      System.out.println("Instant.parse(texto): " + instant2);

      Instant instant3 = Instant.parse("2025-06-12T11:11:11-03:00");
      System.out.println("Instant.parse(texto): " + instant3);

      // Instanciação de texto no formato customizado -> data-hora
      // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

      System.out.println();
      System.out.println("1.3) Instanciação de texto no formato customizado -> data-hora");
      System.out.println("-------------------------------------------------------------------------");

      DateTimeFormatter formatter1 = DateTimeFormatter
            .ofPattern("dd/MM/yyyy");
      LocalDate localDate3 = LocalDate
            .parse("12/06/2025", formatter1);
      System.out.println("LocalDate.parse(texto, formatter): "
            + localDate3);

      DateTimeFormatter formatter2 = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm");
      LocalDateTime localDateTime3 = LocalDateTime
            .parse("12/06/2025 11:11", formatter2);
      System.out.println("LocalDateTime.parse(texto, formatter): "
            + localDateTime3);

      // Instanciação a partir de dia, mês, ano, [horário] -> data-hora local

      System.out.println();
      System.out.println("1.4) Instanciação a partir de dia, mês, ano, [horário] -> data-hora local");
      System.out.println("-------------------------------------------------------------------------");

      LocalDate localDate4 = LocalDate.of(2025, 6, 12);
      System.out.println("LocalDate.of(ano, mês, dia): " + localDate4);

      LocalDateTime localDateTime4 = LocalDateTime.of(2025, 6, 12, 11, 03);
      System.out.println("LocalDateTime.of(ano, mês, dia, hora, minuto): " + localDateTime4);
   }
}
