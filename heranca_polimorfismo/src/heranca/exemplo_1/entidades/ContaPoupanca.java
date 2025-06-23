package heranca.exemplo_1.entidades;

// A palavra chave final impede que novas subclasses sejam
// extendidas da classe ContaPoupanca.

public final class ContaPoupanca extends Conta
{
   private Double juros;

   public ContaPoupanca(Integer numero, String titular, Double saldo, Double juros)
   {
      super(numero, titular, saldo);
      this.juros = juros;
   }

   public Double getJuros()
   {
      return juros;
   }

   public void setJuros(Double juros)
   {
      this.juros = juros;
   }

   // Sobreposição do método saque da classe Conta
   // Anotação @Override avisa ao compilador sobre a sobreposição

   @Override
   public final void saque(Double montante)
   {
      saldo -= montante;
   }

   public void atualizaSaldo()
   {
      saldo += saldo * juros;
   }

   @Override
   public String toString()
   {
      return "ContaPoupanca {" +
            "numero=" + super.getNumero() +
            ", titular='" + super.getTitular() + '\'' +
            ", saldo=" + saldo +
            ", juros=" + juros +
            '}';
   }
}
