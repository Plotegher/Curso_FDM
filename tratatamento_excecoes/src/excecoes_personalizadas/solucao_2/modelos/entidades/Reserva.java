package excecoes_personalizadas.solucao_2.modelos.entidades;

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
      return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
   }

   public String atualizacao(Date checkin, Date checkout)
   {
      Date agora = new Date();
      if (checkin.before(agora) || checkout.before(agora))
      {
         return "ERRO NA RESERVA!\n"
            + "Para atualização de reservas, as datas devem ser futuras!";
      }
      if (checkin.after(checkout))
      {
         return "ERRO NA RESERVA!\n"
            + "A data de check-in deve ser anterior a data de check-out!";
      }
      this.checkin = checkin;
      this.checkout = checkout;
      // Se não houver erros o método retorna null.
      return null;
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
            + " noites";
   }
}
