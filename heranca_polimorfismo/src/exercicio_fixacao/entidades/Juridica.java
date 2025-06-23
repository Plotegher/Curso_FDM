package exercicio_fixacao.entidades;

public class Juridica extends Contribuinte
{
   private Integer empregados;

   public Juridica(String nome, Double renda, Integer empregados)
   {
      super(nome, renda);
      this.empregados = empregados;
   }

   public Integer getEmpregados()
   {
      return empregados;
   }

   public void setEmpregados(Integer empregados)
   {
      this.empregados = empregados;
   }

   @Override
   public Double imposto()
   {
      if (empregados > 10)
      {
         return super.getRenda() * 0.14;
      }
      else
      {
         return super.getRenda() + 0.16;
      }
   }
}
