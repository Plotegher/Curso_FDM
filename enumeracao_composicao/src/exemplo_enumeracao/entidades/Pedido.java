package exemplo_enumeracao.entidades;

import exemplo_enumeracao.enumeracao.Status;

import java.util.Date;

public class Pedido
{
   private Integer id;
   private Date data;
   private Status status;

   public Pedido(Integer id, Date data, Status status)
   {
      this.id = id;
      this.data = data;
      this.status = status;
   }

   public Integer getId()
   {
      return id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public Date getData()
   {
      return data;
   }

   public void setData(Date data)
   {
      this.data = data;
   }

   public Status getStatus()
   {
      return status;
   }

   public void setStatus(Status status)
   {
      this.status = status;
   }

   @Override
   public String toString()
   {
      return "Pedido:" +
            "id = " + id +
            ", data = " + data +
            ", status = " + status;
   }
}
