package exemplo_1.modelos.servicos;

import exemplo_1.modelos.entidades.Fatura;
import exemplo_1.modelos.entidades.Locacao;

import java.time.Duration;

public class ServicoLocacao
{
   private Double precoHora;
   private Double precoDia;

   private ImpostoBrasil impostoBrasil;

   public ServicoLocacao(Double precoHora, Double precoDia, ImpostoBrasil impostoBrasil)
   {
      this.precoHora = precoHora;
      this.precoDia = precoDia;
      this.impostoBrasil = impostoBrasil;
   }

   public Double getPrecoHora()
   {
      return precoHora;
   }

   public void setPrecoHora(Double precoHora)
   {
      this.precoHora = precoHora;
   }

   public Double getPrecoDia()
   {
      return precoDia;
   }

   public void setPrecoDia(Double precoDia)
   {
      this.precoDia = precoDia;
   }

   public ImpostoBrasil getImpostoBrasil()
   {
      return impostoBrasil;
   }

   public void setImpostoBrasil(ImpostoBrasil impostoBrasil)
   {
      this.impostoBrasil = impostoBrasil;
   }

   public void faturamento(Locacao locacao)
   {
      double minutos = Duration.between(locacao.getRetirada(), locacao.getDevolucao()).toMinutes();
      double horas = minutos / 60.0;

      double tarifa;
      if (horas <= 12)
      {
         tarifa = precoHora * Math.ceil(horas);
      }
      else
      {
         tarifa = precoDia * Math.ceil(horas / 24.0);
      }

      double imposto = impostoBrasil.imposto(tarifa);

      locacao.setFatura(new Fatura(tarifa, imposto));
   }
}
