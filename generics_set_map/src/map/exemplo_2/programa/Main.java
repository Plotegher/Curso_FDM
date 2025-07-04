package map.exemplo_2.programa;

// Módulo 04 / Capítulo 16 / aula 12 - Generics, Set e Map
// Exemplo 2 Map

import map.exemplo_2.entidades.Produto;

import java.util.HashMap;
import java.util.Map;

public class Main
{
   public static void main(String[] args)
   {
      Map<Produto, Double> mapa = new HashMap<>();

      Produto p1 = new Produto("Tv", 900.0);
      Produto p2 = new Produto("Notebook", 1200.0);
      Produto p3 = new Produto("Tablet", 400.0);

      mapa.put(p1, 100.0);
      mapa.put(p2, 200.0);
      mapa.put(p3, 150.0);

      Produto p4 = new Produto("Tv", 900.0);
      System.out.println(mapa.containsKey(p4));
   }
}
