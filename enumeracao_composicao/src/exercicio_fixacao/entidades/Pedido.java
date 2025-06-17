package exercicio_fixacao.entidades;

import exercicio_fixacao.enumeracoes.Status;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido
{
   private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
   private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

   private Date momento;
   private Status status;

   private Cliente cliente;
   private List<Item> itens = new ArrayList<>();

   public Pedido(Date momento, Status status, Cliente cliente)
   {
      this.momento = new Date();
      this.status = status;
      this.cliente = cliente;
   }

   public Date getMomento()
   {
      return momento;
   }

   public void setMomento(Date momento)
   {
      this.momento = momento;
   }

   public Status getStatus()
   {
      return status;
   }

   public void setStatus(Status status)
   {
      this.status = status;
   }

   public Cliente getCliente()
   {
      return cliente;
   }

   public void setCliente(Cliente cliente)
   {
      this.cliente = cliente;
   }

   public List<Item> getItens()
   {
      return itens;
   }

   public void adicionarItem(Item item)
   {
      itens.add(item);
   }

   public void removerItem(Item item)
   {
      itens.remove(item);
   }

   @Override
   public String toString()
   {
      StringBuilder sbd = new StringBuilder();
      sbd.append("\n");
      sbd.append("RESUMO DO PEDIDO:");
      sbd.append("\n");
      sbd.append("Criação do pedido: ");
      sbd.append(sdf1.format(momento));
      sbd.append("\n");
      sbd.append("Status do pedido: ");
      sbd.append(status);
      sbd.append("\n");
      sbd.append("Cliente: ");
      sbd.append(cliente.getNome());
      sbd.append(" (");
      sbd.append(sdf2.format(cliente.getAniversario()));
      sbd.append(") - ");
      sbd.append(cliente.getEmail());
      sbd.append("\n");
      sbd.append("Itens do pedido:");
      sbd.append("\n");
      for (Item i : itens)
      {
         sbd.append(i.getProduto().getNome());
         sbd.append(", R$ ");
         sbd.append(String.format("%.2f", i.getProduto().getPreco()));
         sbd.append(", Quantidade: ");
         sbd.append(i.getQuantidade());
         sbd.append(", Subtotal: R$ ");
         sbd.append(String.format("%.2f", i.subTotal()));
         sbd.append("\n");
      }
      return sbd.toString();
   }
}
