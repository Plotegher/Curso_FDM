package exercicio_fixacao.modelos.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela
{
   private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

   private LocalDate vencimento;
   private Double valor;

   public Parcela(LocalDate vencimento, Double valor)
   {
      this.vencimento = vencimento;
      this.valor = valor;
   }

   public LocalDate getVencimento()
   {
      return vencimento;
   }

   public void setVencimento(LocalDate vencimento)
   {
      this.vencimento = vencimento;
   }

   public Double getValor()
   {
      return valor;
   }

   public void setValor(Double valor)
   {
      this.valor = valor;
   }

   @Override
   public String toString()
   {
      return vencimento.format(dtf)
            + " - "
            + String.format("%.2f", valor);
   }
}
