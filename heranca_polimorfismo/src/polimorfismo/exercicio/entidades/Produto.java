package polimorfismo.exercicio.entidades;

public class Produto
{
   private String nome;
   private Double preco;

   public Produto(String nome, Double preco)
   {
      this.nome = nome;
      this.preco = preco;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public Double getPreco()
   {
      return preco;
   }

   public void setPreco(Double preco)
   {
      this.preco = preco;
   }

   public String etiqueta()
   {
      StringBuilder sbd = new StringBuilder();
      sbd.append(nome);
      sbd.append(" R$ ");
      sbd.append(String.format("%.2f", preco));
      return sbd.toString();
   }
}
