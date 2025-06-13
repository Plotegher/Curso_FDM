package operacoes.exemplo_2;

// Módulo 04 / Capítulo 10 / aula 06 - Trabalhando com datas e horas
// Exemplo 2

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main
{
   public static void main(String[] args)
   {
      // Formatação de data-hora local -> texto ISO 8601

      System.out.println();
      System.out.println("2.1) Formatação de data-hora local -> texto ISO 8601");
      System.out.println("-------------------------------------------------------------------------");

      LocalDate localDate1 = LocalDate.parse("2025-06-12");
      DateTimeFormatter formatter1 = DateTimeFormatter
            .ofPattern("dd/MM/yyyy");
      System.out.println("Objeto LocalDate para texto ISO personalizado: "
            + formatter1.format(localDate1));

      LocalDateTime localDateTime1 = LocalDateTime.parse("2025-06-12T13:16:30");
      DateTimeFormatter formatter2 = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm:ss");
      System.out.println("Objeto LocalDateTime para texto ISO personalizado: "
            + formatter2.format(localDateTime1));

      // Formatação de data-hora global -> texto formatado customizado

      System.out.println();
      System.out.println("2.2) Formatação de data-hora global -> texto formatado customizado");
      System.out.println("-------------------------------------------------------------------------");

      Instant instant1 = Instant.parse("2025-06-12T13:16:30Z");
      DateTimeFormatter formatter3 = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm:ss")
            .withZone(ZoneId.systemDefault());
      System.out.println("Objeto Instant para texto ISO personalizado: "
            + formatter3.format(instant1));

      DateTimeFormatter formatter4 = DateTimeFormatter
            .ISO_INSTANT;
      System.out.println("Usando o tipo ISO_INSTANT: " + formatter4.format(instant1));
   }
}
