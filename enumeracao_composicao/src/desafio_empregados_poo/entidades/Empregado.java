package desafio_empregados_poo.entidades;

public class Empregado
{
   private String nomeEmpregado;
   private Double salario;

   public Empregado(String nomeEmpregado, Double salario)
   {
      this.nomeEmpregado = nomeEmpregado;
      this.salario = salario;
   }

   public String getNomeEmpregado()
   {
      return nomeEmpregado;
   }

   public void setNome(String nomeEmpregado)
   {
      this.nomeEmpregado = nomeEmpregado;
   }

   public Double getSalario()
   {
      return salario;
   }

   public void setSalario(Double salario)
   {
      this.salario = salario;
   }
}
