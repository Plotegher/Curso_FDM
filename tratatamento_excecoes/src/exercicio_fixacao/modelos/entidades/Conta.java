package exercicio_fixacao.modelos.entidades;

import exercicio_fixacao.modelos.excecoes.LimiteException;
import exercicio_fixacao.modelos.excecoes.SaldoException;

public class Conta
{
   private Integer numero;
   private String titular;
   private Double saldo;
   private Double limite;

   public Conta(Integer numero, String titular, Double saldo, Double limite)
   {
      this.numero = numero;
      this.titular = titular;
      this.saldo = saldo;
      this.limite = limite;
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

   public Double getLimite()
   {
      return limite;
   }

   public void setLimite(Double limite)
   {
      this.limite = limite;
   }

   public void deposito(Double montante)
   {
      saldo += montante;
   }

   public void saque(Double montante) throws LimiteException, SaldoException
   {
      if (montante > limite)
      {
         throw new LimiteException
               ("Erro no saque: "
               + "O valor excede o limite de saque!");
      }
      else if (montante > saldo)
      {
         throw new SaldoException
               ("Erro no saque: "
                     + "Saldo insuficiente!");
      }
      else
      {
         saldo -= montante;
      }
   }
}
