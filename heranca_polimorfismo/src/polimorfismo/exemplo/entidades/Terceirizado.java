package polimorfismo.exemplo.entidades;

public class Terceirizado extends Empregado
{
   private Double despesa;

   public Terceirizado(String nome, Integer horas, Double valorHora, Double despesa)
   {
      super(nome, horas, valorHora);
      this.despesa = despesa;
   }

   public Double getDespesa()
   {
      return despesa;
   }

   public void setDespesa(Double despesa)
   {
      this.despesa = despesa;
   }

   @Override
   public Double pagamento()
   {
      return (super.pagamento()) + (despesa * 1.1);
   }
}
