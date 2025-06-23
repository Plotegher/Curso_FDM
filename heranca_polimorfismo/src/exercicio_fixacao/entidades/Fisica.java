package exercicio_fixacao.entidades;

public class Fisica extends Contribuinte
{
   private Double despesas;

   public Fisica(String nome, Double renda, Double despesas)
   {
      super(nome, renda);
      this.despesas = despesas;
   }

   public Double getDespesas()
   {
      return despesas;
   }

   public void setDespesas(Double despesas)
   {
      this.despesas = despesas;
   }

   @Override
   public Double imposto()
   {
      if (super.getRenda() < 20000.0)
      {
         return (super.getRenda() * 0.15) - (despesas * 0.5);
      }
      else
      {
         return (super.getRenda() * 0.25) - (despesas * 0.5);
      }
   }
}
