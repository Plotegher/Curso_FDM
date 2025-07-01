package exemplo_2.modelos.entidades;

import java.time.LocalDateTime;

public class Locacao
{
   private LocalDateTime retirada;
   private LocalDateTime devolucao;

   private Veiculo veiculo;
   private Fatura fatura;

   public Locacao(LocalDateTime retirada, LocalDateTime devolucao, Veiculo veiculo)
   {
      this.retirada = retirada;
      this.devolucao = devolucao;
      this.veiculo = veiculo;
   }

   public Locacao(LocalDateTime retirada, LocalDateTime devolucao, Veiculo veiculo, Fatura fatura)
   {
      this.retirada = retirada;
      this.devolucao = devolucao;
      this.veiculo = veiculo;
      this.fatura = fatura;
   }

   public LocalDateTime getRetirada()
   {
      return retirada;
   }

   public void setRetirada(LocalDateTime retirada)
   {
      this.retirada = retirada;
   }

   public LocalDateTime getDevolucao()
   {
      return devolucao;
   }

   public void setDevolucao(LocalDateTime devolucao)
   {
      this.devolucao = devolucao;
   }

   public Veiculo getVeiculo()
   {
      return veiculo;
   }

   public void setVeiculo(Veiculo veiculo)
   {
      this.veiculo = veiculo;
   }

   public Fatura getFatura()
   {
      return fatura;
   }

   public void setFatura(Fatura fatura)
   {
      this.fatura = fatura;
   }
}
