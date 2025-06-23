package polimorfismo.exercicio.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usado extends Produto
{
   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

   private Date fabricado;

   public Usado(String nome, Double preco, Date fabricado)
   {
      super(nome, preco);
      this.fabricado = fabricado;
   }

   public Date getFabricado()
   {
      return fabricado;
   }

   public void setFabricado(Date fabricado)
   {
      this.fabricado = fabricado;
   }

   @Override
   public String etiqueta()
   {
      StringBuilder sbd = new StringBuilder();
      sbd.append(super.getNome());
      sbd.append(" (usado) R$ ");
      sbd.append(String.format("%.2f", super.getPreco()));
      sbd.append(" (Data de fabricação: ");
      sbd.append(sdf.format(fabricado));
      sbd.append(")");
      return sbd.toString();
   }
}
