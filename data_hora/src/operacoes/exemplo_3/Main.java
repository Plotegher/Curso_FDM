package operacoes.exemplo_3;

// Módulo 04 / Capítulo 10 / aula 07 - Trabalhando com datas e horas
// Exemplo 3

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static java.time.ZoneId.getAvailableZoneIds;

public class Main
{
   public static void main(String[] args)
   {
      // Converter data-hora global, timezone (sistema local) -> data-hora local

      System.out.println();
      System.out.println("3.1) Converter data-hora global, timezone (sistema local) -> data-hora local");
      System.out.println("----------------------------------------------------------------------------");

      Instant instant1 = Instant.parse("2025-06-12T15:52:30Z");

      LocalDate localDate2 = LocalDate
            .ofInstant(instant1, ZoneId.systemDefault());
      System.out.println("LocalDate.ofInstant(instant, ZoneId.systemDefault(): "
            + localDate2);

      LocalDate localDate3 = LocalDate
            .ofInstant(instant1, ZoneId.of("Portugal"));
      System.out.println("LocalDate.ofInstant(instant, ZoneId.of(zoneId): "
            + localDate3);

      LocalDateTime localDateTime2 = LocalDateTime
            .ofInstant(instant1, ZoneId.systemDefault());
      System.out.println("LocalDateTime.ofInstant(instant, ZoneId.systemDefault(): "
            + localDateTime2);

      LocalDateTime localDateTime3 = LocalDateTime
            .ofInstant(instant1, ZoneId.of("Portugal"));
      System.out.println("LocalDateTime.ofInstant(instant, ZoneId.of(zoneId): "
            + localDateTime3);

      // OBS - Para obter os zones id disponíveis:

      System.out.println();
      System.out.println("OBS) Para obter os zones id disponíveis (descomentar sout):");
      System.out.println("----------------------------------------------------------------------------");

      for (String s : getAvailableZoneIds())
      {
         //System.out.println(s);
      }

      // Obter dados de uma data-hora local -> dia, mês, ano, horário

      System.out.println();
      System.out.println("3.2) Obter dados de uma data-hora local -> dia, mês, ano, horário");
      System.out.println("----------------------------------------------------------------------------");

      LocalDate localDate1 = LocalDate.parse("2025-06-12");
      System.out.println("Dia: " + localDate1.getDayOfMonth());
      System.out.println("Mês: " + localDate1.getMonthValue());
      System.out.println("Ano: " + localDate1.getYear());

      LocalDateTime localDateTime1 = LocalDateTime.parse("2025-06-12T15:45:30");
      System.out.println("Hora: " + localDateTime1.getHour());
      System.out.println("Minuto: " + localDateTime1.getMinute());
      System.out.println("Segundo: " + localDateTime1.getSecond());
   }
}
