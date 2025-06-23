package heranca.exemplo_1.entidades;

// Classe conta é uma generelização

public class Conta
{
   private Integer numero;
   private String titular;
   // protected libera o acesso da subclasse ContaPJ ao atributo saldo
   protected Double saldo;

   public Conta(Integer numero, String titular, Double saldo)
   {
      this.numero = numero;
      this.titular = titular;
      this.saldo = saldo;
   }

   public Integer getNumero()
   {
      return numero;
   }

   public void setNumero(Integer numero)
   {
      this.numero = numero;
   }

   public String getTitular()
   {
      return titular;
   }

   public void setTitular(String titular)
   {
      this.titular = titular;
   }

   public Double getSaldo()
   {
      return saldo;
   }

   public void saque(Double montante)
   {
      saldo -= montante + 5.0;
   }

   // A palavra chave final impede que o método deposito seja
   // sobreposto em outra classe.

   public final void deposito(Double montante)
   {
      saldo += montante;
   }

   @Override
   public String toString()
   {
      return "Conta {" +
            "numero=" + numero +
            ", titular='" + titular + '\'' +
            ", saldo=" + saldo +
            '}';
   }
}
