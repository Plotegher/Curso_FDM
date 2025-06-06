package exercicio.entidades;

public class Conta
{
   private String numero;
   private String titular;
   private double saldo;

   public Conta(String numero, String titular)
   {
      this.numero = numero;
      this.titular = titular;
   }

   public Conta(String numero, String titular, double saldo)
   {
      this.numero = numero;
      this.titular = titular;
      this.saldo = 0.0;
   }

   public String getNumero()
   {
      return numero;
   }

   public String getTitular()
   {
      return titular;
   }

   public void setTitular(String titular)
   {
      this.titular = titular;
   }

   public double getSaldo()
   {
      return saldo;
   }

   public void deposito(double montante)
   {
      this.saldo += montante;
   }

   public void retirada(double montante)
   {
      this.saldo -= montante + 5.0;
   }

   @Override
   public String toString()
   {
      return "Conta "
            + getNumero()
            + ", Titular: "
            + getTitular()
            + ", Saldo: R$ "
            + String.format("%.2f", getSaldo());
   }
}
