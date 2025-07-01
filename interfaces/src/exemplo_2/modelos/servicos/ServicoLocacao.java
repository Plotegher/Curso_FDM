package exemplo_2.modelos.servicos;

import exemplo_2.modelos.entidades.Fatura;
import exemplo_2.modelos.entidades.Locacao;

import java.time.Duration;

public class ServicoLocacao
{
   private Double precoHora;
   private Double precoDia;

   private Imposto imposto;

   // Utilizado aqui a inversão de controle que retirou da classe "ServicoLocacao" a
   // responsabilidade de instanciar uma classe concreta que implemente a interface "Imposto".
   public ServicoLocacao(Double precoHora, Double precoDia, Imposto imposto)
   {
      this.precoHora = precoHora;
      this.precoDia = precoDia;
      this.imposto = imposto;
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

   public Imposto getImposto() { return imposto; }

   public void setImpostoBrasil(Imposto imposto)
   {
      this.imposto = imposto;
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

      double apurado = imposto.calculaImposto(tarifa);

      locacao.setFatura(new Fatura(tarifa, apurado));
   }
}
