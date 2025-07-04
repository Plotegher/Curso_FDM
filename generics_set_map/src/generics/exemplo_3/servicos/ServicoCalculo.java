package generics.exemplo_3.servicos;

import java.util.List;

public class ServicoCalculo
{
   // Com o método static não é preciso instanciar o ServicoCalculo
   public static <Tipo extends Comparable<Tipo>> Tipo maximo(List<Tipo> lista)
   {
      if (lista.isEmpty())
      {
         throw new IllegalStateException("A lista não pode estar vazia!");
      }

      Tipo maior = lista.get(0);
      for (Tipo item : lista)
      {
         if (item.compareTo(maior) > 0)
         {
            maior = item;
         }
      }

      return maior;
   }
}
