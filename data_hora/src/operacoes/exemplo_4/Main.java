package operacoes.exemplo_4;

// Módulo 04 / Capítulo 10 / aula 08 - Trabalhando com datas e horas
// Exemplo 4

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;

public class Main
{
   public static void main(String[] args)
   {
      // Cálculos com data-hora +/- tempo -> data-hora:

      System.out.println();
      System.out.println("4.1) Cálculos com data-hora +/- tempo -> data-hora:");
      System.out.println("----------------------------------------------------------------------------");

      LocalDate localDate1 = LocalDate.parse("2025-06-13");
      LocalDateTime localDateTime1 = LocalDateTime.parse("2025-06-13T10:05:30");
      Instant instant1 = Instant.parse("2025-06-13T10:05:30Z");

      // Acrescentar tempo:

      System.out.println();
      System.out.println("A) Acrescentando tempo:");
      System.out.println("----------------------------------------------------------------------------");

      LocalDate maisDia1 = localDate1.plusDays(14);
      System.out.println("Somando 14 dias: " + maisDia1);
      LocalDate maisSemana1 = localDate1.plusWeeks(3);
      System.out.println("Somando 3 semanas: " + maisSemana1);
      LocalDate maisMes1 = localDate1.plusMonths(1);
      System.out.println("Somando 1 mês: " + maisMes1);
      LocalDate maisAno1 = localDate1.plusYears(1);
      System.out.println("Somando 1 ano: " + maisAno1);

      System.out.println("----------------------------------------------------------------------------");
      LocalDateTime maisDia2 = localDateTime1.plusDays(14);
      System.out.println("Somando 14 dias: " + maisDia2);
      LocalDateTime maisSemana2 = localDateTime1.plusWeeks(3);
      System.out.println("Somando 3 semanas: " + maisSemana2);
      LocalDateTime maisMes2 = localDateTime1.plusMonths(1);
      System.out.println("Somando 1 mês: " + maisMes2);
      LocalDateTime maisAno2 = localDateTime1.plusYears(1);
      System.out.println("Somando 1 ano: " + maisAno2);
      LocalDateTime maisHora1 = localDateTime1.plusHours(14);
      System.out.println("Somando 14 horas: " + maisHora1);
      LocalDateTime maisMinuto1 = localDateTime1.plusMinutes(15);
      System.out.println("Somando 15 minutos: " + maisMinuto1);
      LocalDateTime maisSegundo1 = localDateTime1.plusSeconds(15);
      System.out.println("Somando 15 segundos: " + maisSegundo1);

      System.out.println("----------------------------------------------------------------------------");
      Instant maisDia3 = instant1.plus(14, DAYS);
      System.out.println("Somando 14 dias: " + maisDia3);
      System.out.println(
            "// Instant maisSemana3 = instant1.plus(3, WEEKS);\n" +
            "// Não é compatível com classes java.time (LocalTime ou Instant)\n" +
            "// Instant maisMes3 = instant1.plus(1, MONTHS);\n" +
            "// Não é compatível com classes java.time (LocalTime ou Instant)\n" +
            "// Instant maisAno3 = instant1.plus(1, YEARS);\n" +
            "// Não é compatível com classes java.time (LocalTime ou Instant)"
      );
      Instant maisHora2 = instant1.plus(14, HOURS);
      System.out.println("Somando 14 horas: " + maisHora2);
      Instant maisMinuto2 = instant1.plus(15, MINUTES);
      System.out.println("Somando 15 minutos: " + maisMinuto2);
      Instant maisSegundo2 = instant1.plus(15, SECONDS);
      System.out.println("Somando 15 segundos: " + maisSegundo2);

      // Retirar tempo:

      System.out.println();
      System.out.println("B) Retirando tempo:");
      System.out.println("----------------------------------------------------------------------------");

      LocalDate menosDia1 = localDate1.minusDays(14);
      System.out.println("Retirando 14 dias: " + menosDia1);
      LocalDate menosSemana1 = localDate1.minusWeeks(3);
      System.out.println("Retirando 3 semanas: " + menosSemana1);
      LocalDate menosMes1 = localDate1.minusMonths(1);
      System.out.println("Retirando 1 mês: " + menosMes1);
      LocalDate menosAno1 = localDate1.minusYears(1);
      System.out.println("Retirando 1 ano: " + menosAno1);

      System.out.println("----------------------------------------------------------------------------");
      LocalDateTime menosDia2 = localDateTime1.minusDays(14);
      System.out.println("Retirando 14 dias: " + menosDia2);
      LocalDateTime menosSemana2 = localDateTime1.minusWeeks(3);
      System.out.println("Retirando 3 semanas: " + menosSemana2);
      LocalDateTime menosMes2 = localDateTime1.minusMonths(1);
      System.out.println("Retirando 1 mês: " + menosMes2);
      LocalDateTime menosAno2 = localDateTime1.minusYears(1);
      System.out.println("Retirando 1 ano: " + menosAno2);
      LocalDateTime menosHora = localDateTime1.minusHours(14);
      System.out.println("Retirando 14 horas: " + menosHora);
      LocalDateTime menosMinuto = localDateTime1.minusMinutes(15);
      System.out.println("Retirando 15 minutos: " + menosMinuto);
      LocalDateTime menosSegundo = localDateTime1.minusSeconds(15);
      System.out.println("Retirando 15 segundos: " + menosSegundo);

      System.out.println("----------------------------------------------------------------------------");
      Instant menosDia3 = instant1.minus(14, DAYS);
      System.out.println("Retirando 14 dias: " + menosDia3);
      System.out.println(
            "// Instant menosSemana3 = instant1.minus(3, WEEKS);\n" +
                  "// Não é compatível com classes java.time (LocalTime ou Instant)\n" +
                  "// Instant menosMes3 = instant1.minus(1, MONTHS);\n" +
                  "// Não é compatível com classes java.time (LocalTime ou Instant)\n" +
                  "// Instant menosAno3 = instant1.minus(1, YEARS);\n" +
                  "// Não é compatível com classes java.time (LocalTime ou Instant)"
      );
      Instant menosHora2 = instant1.minus(14, HOURS);
      System.out.println("Retirando 14 horas: " + menosHora2);
      Instant menosMinuto2 = instant1.minus(15, MINUTES);
      System.out.println("Retirando 15 minutos: " + menosMinuto2);
      Instant menosSegundo2 = instant1.minus(15, SECONDS);
      System.out.println("Retirando 15 segundos: " + menosSegundo2);

      // Cálculos com data-hora 1, data-hora2 -> duração

      System.out.println();
      System.out.println("4.2) Cálculos com data-hora 1, data-hora2 -> duração:");
      System.out.println("----------------------------------------------------------------------------");

      LocalDateTime instantInicial = LocalDateTime.parse("1971-05-29T14:05:00");
      System.out.println("Instante inicial: " + instantInicial);
      LocalDateTime instantFinal = LocalDateTime.now();
      System.out.println("Instante final: " + instantFinal);

      Duration duration = Duration.between(instantInicial, instantFinal);
      System.out.println("Duração em dias: " + duration.toDays());
      System.out.println("Duração em horas: " + duration.toHours());
      System.out.println("Duração em minutos: " + duration.toMinutes());
      System.out.println("Duração em segundos: " + duration.toSeconds());

      // OBS - Converter um LocalDate para um LocalDateTime

      System.out.println();
      System.out.println("OBS) Converter um LocalDate para um LocalDateTime:");
      System.out.println("----------------------------------------------------------------------------");

      LocalDate localDateOBS = LocalDate.parse("2025-06-13");
      LocalDateTime localDateTimeOBS1 = localDateOBS.atTime(0, 0);
      LocalDateTime localDateTimeOBS2 = localDateOBS.atStartOfDay();
      System.out.println("LocalDate convertido (localDate.atTime(hora, minuto)): " + localDateTimeOBS1);
      System.out.println("LocalDate convertido (localDate.atStartOfDay()): " + localDateTimeOBS2);
   }
}
