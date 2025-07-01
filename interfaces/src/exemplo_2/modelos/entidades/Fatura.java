package exemplo_2.modelos.entidades;

public class Fatura
{
   private Double tarifa;
   private Double imposto;

   public Fatura(Double tarifa, Double imposto)
   {
      this.tarifa = tarifa;
      this.imposto = imposto;
   }

   public Double getTarifa()
   {
      return tarifa;
   }

   public void setTarifa(Double tarifa)
   {
      this.tarifa = tarifa;
   }

   public Double getImposto()
   {
      return imposto;
   }

   public void setImposto(Double imposto)
   {
      this.imposto = imposto;
   }

   public Double getTotal()
   {
      return getTarifa() + getImposto();
   }
}
