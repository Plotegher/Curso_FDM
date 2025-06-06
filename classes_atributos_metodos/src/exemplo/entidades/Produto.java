package exemplo.entidades;

public class Produto
{
   public String nome;
   public double preco;
   public int quantidade;

//   public Produto(String nome, double preco, int quantidade)
//   {
//      this.nome = nome;
//      this.preco = preco;
//      this.quantidade = quantidade;
//   }

   public double valorTotalEstoque()
   {
      return preco * quantidade;
   }

   public void adicionaProduto(int quantidade)
   {
      this.quantidade += quantidade;
   }

   public void removeProduto(int quantidade)
   {
      this.quantidade -= quantidade;
   }

   @Override
   public String toString()
   {
      return nome + ", R$ "
            + String.format("%.2f",preco)
            + ", " +  quantidade
            + " unidades, Total: R$ "
            + String.format("%.2f", valorTotalEstoque());
   }
}
