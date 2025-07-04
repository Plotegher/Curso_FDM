package generics.tipos_curinga;

// Módulo 04 / Capítulo 16 / aula 04 - Generics, Set e Map
// Tipos curinga (wildcard types)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
   public static void main(String[] args)
   {
      // O super tipo de qualquer tipo de lista é o
      // tipo curinga "?".
      // Não é possível adicionar dados em uma lista de tipo curinga.

      /*
         List<?> objetos = new ArrayList<Object>();
         // objetos.add(3); -> gera erro de compilação
         List<Integer> numeros = new ArrayList<Integer>();
         objetos = numeros;
      */

      List<Integer> inteiros = Arrays.asList(1, 2, 3);
      imprimir(inteiros);

      List<String> strings = Arrays.asList("Jesus", "Maria", "José");
      imprimir(strings);
   }

   // Método genérico que imprime qualquer tipo de lista
   public static void imprimir(List<?> lista)
   {
      for (Object o : lista)
      {
         System.out.println(o);
      }
   }
}
