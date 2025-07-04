package generics.exemplo_2.servicos;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<Tipo>
{
   List<Tipo> lista = new ArrayList<>();

   public void adicionaValor(Tipo valor)
   {
      lista.add(valor);
   }

   public Tipo primeiro()
   {
      if (lista.isEmpty())
      {
         throw new IllegalStateException("A lista está vazia!");
      }
      return lista.get(0);
   }

   public void imprimir()
   {
      System.out.print("[");
      if (!lista.isEmpty())
      {
         System.out.print(lista.get(0));
      }
      for (int i = 1; i < lista.size(); i++)
      {
         System.out.print(", " + lista.get(i));
      }
      System.out.println("]");
   }
}
