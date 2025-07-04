package generics.curingas_delimitados.problema_2;

// Módulo 04 / Capítulo 16 / aula 05 - Generics, Set e Map
// Problema 2: Curingas delimitados (bounded wildcards)

// Princípio get / put - Contravariância
// get: Erro (não consegue acessar a lista)
// put: OK (consegue adicionar elementos a lista)

import java.util.ArrayList;
import java.util.List;

public class Contravariancia
{
   public static void main(String[] args)
   {
      List<Object> objetos = new ArrayList<Object>();
      objetos.add("José");
      objetos.add("Maria");

      // <? super Number> Lista de qualquer tipo que seja super tipo de Number
      List<? super Number> lista_2 = objetos;

      lista_2.add(30);

      // Number n = lista_2.get(0); -> Erro de compilação
      // System.out.println(n);

      for (Object o : lista_2)
      {
         System.out.println(o);
      }
   }
}
