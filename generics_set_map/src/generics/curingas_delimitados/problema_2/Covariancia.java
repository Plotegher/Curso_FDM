package generics.curingas_delimitados.problema_2;

// Módulo 04 / Capítulo 16 / aula 05 - Generics, Set e Map
// Problema 2: Curingas delimitados (bounded wildcards)

// Princípio get / put - Covariância
// get: OK (consegue acessar a lista)
// put: Erro (não consegue adicionar elementos a lista)

import java.util.ArrayList;
import java.util.List;

public class Covariancia
{
   public static void main(String[] args)
   {
      List<Integer> inteiros = new ArrayList<Integer>();
      inteiros.add(10);
      inteiros.add(20);

      // <? extends Number> Lista de qualquer tipo que seja subtipo de Number
      List<? extends Number> lista_1 = inteiros;

      Number n = lista_1.get(0);
      System.out.println(n);

      // lista_1.add(30); -> Erro de compilação
   }
}
