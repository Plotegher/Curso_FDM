package heranca.exemplo_1.entidades;

// Classe ContaPJ é uma especialização da classe Conta

public class ContaEmpresa extends Conta
{
   private Double limite;

   public ContaEmpresa(Integer numero, String titular, Double saldo, Double limite)
   {
      super(numero, titular, saldo);
      this.limite = limite;
   }

   public Double getLimite()
   {
      return limite;
   }

   public void setLimite(Double limite)
   {
      this.limite = limite;
   }

   public void emprestimo(Double montante)
   {
      if (montante <= limite)
      {
         saldo += montante - 10.0;
      }
   }

   // Sobreposição do método saque da classe Conta reaproveitando
   // parte do código com o super. A palavra chave final impede a
   // sobreposição de uma sobreposição.

   @Override
   public final void saque(Double montante)
   {
      super.saque(montante);
      saldo -= 2.0;
   }

   @Override
   public String toString()
   {
      return "ContaPJ {" +
            "numero=" + super.getNumero() +
            ", titular='" + super.getTitular() + '\'' +
            ", saldo=" + saldo +
            ", limite=" + limite +
            '}';
   }
}
