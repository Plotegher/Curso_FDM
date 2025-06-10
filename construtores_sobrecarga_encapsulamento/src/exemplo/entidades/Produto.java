package exemplo.entidades;

public class Produto
{
   // ATRIBUTOS

   // Atributos privados (Encapsulamento)

   private String nomeAtributo;
   private double precoAtributo;
   private int quantidadeAtributo;

   // MÉTODOS CONSTRUTORES

   // Construtor padrão sem argumentos
   public Produto() {}

   // Sobrecarga - Construtor com 2 argumentos
   public Produto(String nomeArgumento, double precoArgumento)
   {
      this.nomeAtributo = nomeArgumento;
      this.precoAtributo = precoArgumento;
   }

   // Sobrecarga - Construtor com 3 argumentos
   public Produto(String nomeArgumento, double precoArgumento, int quantidadeArgumento)
   {
      this.nomeAtributo = nomeArgumento;
      this.precoAtributo = precoArgumento;
      this.quantidadeAtributo = quantidadeArgumento;
   }

   // MÉTODOS GETTERS E SETTERS (Encapsulamento)

   public String getNomeAtributo()
   {
      return nomeAtributo;
   }

   public void setNomeAtributo(String nomeArgumento)
   {
      this.nomeAtributo = nomeArgumento;
   }

   public double getPrecoAtributo()
   {
      return precoAtributo;
   }

   public void setPrecoAtributo(double precoArgumento)
   {
      this.precoAtributo = precoArgumento;
   }

   public int getQuantidadeAtributo()
   {
      return quantidadeAtributo;
   }

   /* setQuantidadeAtributo não foi criado porque as quantidades
      só serão alteradas pelos métodos especiais adiciona ou remove
      produto.
   */

   // MÉTODOS ESPECIAIS

   public double valorTotalEstoque()
   {
      return precoAtributo * quantidadeAtributo;
   }

   public void adicionaProduto(int quantidadeArgumento)
   {
      this.quantidadeAtributo += quantidadeArgumento;
   }

   public void removeProduto(int quantidadeArgumento)
   {
      this.quantidadeAtributo -= quantidadeArgumento;
   }

   // Sobrecarga do método toString() da classe Object

   @Override
   public String toString()
   {
      return nomeAtributo + ", R$ "
            + String.format("%.2f", precoAtributo)
            + ", " +  quantidadeAtributo
            + " unidades, Total: R$ "
            + String.format("%.2f", valorTotalEstoque());
   }
}
