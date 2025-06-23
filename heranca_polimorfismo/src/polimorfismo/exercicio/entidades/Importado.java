package polimorfismo.exercicio.entidades;

public class Importado extends Produto
{
   private Double alfandegario;

   public Importado(String nome, Double preco, Double alfandegario)
   {
      super(nome, preco);
      this.alfandegario = alfandegario;
   }

   public Double getAlfandegario()
   {
      return alfandegario;
   }

   public void setAlfandegario(Double alfandegario)
   {
      this.alfandegario = alfandegario;
   }

   public Double total()
   {
      return super.getPreco() + alfandegario;
   }

   @Override
   public String etiqueta()
   {
      StringBuilder sbd = new StringBuilder();
      sbd.append(super.getNome());
      sbd.append(" R$ ");
      sbd.append(String.format("%.2f", total()));
      sbd.append(" (Custo alfandegário: R$ ");
      sbd.append(String.format("%.2f", alfandegario));
      sbd.append(")");
      return sbd.toString();
   }
}
