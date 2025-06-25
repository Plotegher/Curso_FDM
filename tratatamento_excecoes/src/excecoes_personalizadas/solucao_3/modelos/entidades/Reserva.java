package excecoes_personalizadas.solucao_3.modelos.entidades;

import excecoes_personalizadas.solucao_3.modelos.excecoes.ExcecaoDominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva
{
   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

   private Integer quarto;
   private Date checkin;
   private Date checkout;

   public Reserva(Integer quarto, Date checkin, Date checkout)
   {
      this.quarto = quarto;
      this.checkin = checkin;
      this.checkout = checkout;
   }

   public Integer getQuarto()
   {
      return quarto;
   }

   public void setQuarto(Integer quarto)
   {
      this.quarto = quarto;
   }

   public Date getCheckin()
   {
      return checkin;
   }

   public Date getCheckout()
   {
      return checkout;
   }

   public Long duracao()
   {
      long diferenca = checkout.getTime() - checkin.getTime();
      if (diferenca < 0L)
      {
         throw new IllegalArgumentException
               ("ERRO NA RESERVA!\n"
               + "A data de check-in deve ser anterior a data de check-out!");
      }
      else if (diferenca == 0L)
      {
         return 1L;
      }
      else
      {
         return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
      }
   }

   public void atualizacao(Date checkin, Date checkout) throws ExcecaoDominio
   {
      Date agora = new Date();
      if (checkin.before(agora) || checkout.before(agora))
      {
         throw new ExcecaoDominio
               ("ERRO NA RESERVA!\n"
               + "Para atualização de reservas as datas devem ser futuras!");
      }
      if (checkin.after(checkout))
      {
         throw new ExcecaoDominio
               ("ERRO NA RESERVA!\n"
               + "A data de check-in deve ser anterior a data de check-out!");
      }
      this.checkin = checkin;
      this.checkout = checkout;
   }

   @Override
   public String toString()
   {
      return "Quarto "
            + quarto
            + ", check-in: "
            + sdf.format(checkin)
            + ", check-out: "
            + sdf.format(checkout)
            + ", "
            + duracao()
            + " noite(s)";
   }
}
