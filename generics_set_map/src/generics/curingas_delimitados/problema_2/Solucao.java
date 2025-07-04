package generics.curingas_delimitados.problema_2;

// Módulo 04 / Capítulo 16 / aula 05 - Generics, Set e Map
// Problema 2: Curingas delimitados (bounded wildcards)
// Solução usando o princípio get / put

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Solucao
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);

      List<Integer> inteiros = Arrays.asList(1, 2, 3);
      List<Double> decimais = Arrays.asList(1.4, 2.5, 3.6);
      List<Object> objetos = new ArrayList<Object>();

      copiar(inteiros, objetos);
      imprimir(objetos);

      copiar(decimais, objetos);
      imprimir(objetos);
   }

   // Método que copia os elementos de uma lista para uma
   // outra lista que possa ser mais genérica que a primeira.

   public static void copiar(List<? extends Number> origem, List<? super Number> destino)
   {
      for (Number n : origem)
      {
         destino.add(n);
      }
   }

   public static void imprimir(List<?> lista)
   {
      for (Object o : lista)
      {
         System.out.print(o + " ");
      }
      System.out.println();
   }
}
