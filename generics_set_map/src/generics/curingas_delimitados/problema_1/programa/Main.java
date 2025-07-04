package generics.curingas_delimitados.problema_1.programa;

// Módulo 04 / Capítulo 16 / aula 05 - Generics, Set e Map
// Problema 1: Curingas delimitados (bounded wildcards)

import generics.curingas_delimitados.problema_1.entidades.Circulo;
import generics.curingas_delimitados.problema_1.entidades.Forma;
import generics.curingas_delimitados.problema_1.entidades.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class Main
{
   public static void main(String[] args)
   {
      List<Forma> formas = new ArrayList<>();
      formas.add(new Retangulo(3.0, 2.0));
      formas.add(new Circulo(2.0));

      System.out.println("Total das áreas: "
            + String.format("%.2f", areaTotal(formas)));
   }

   // O método areaTotal() só funciona para uma lista de Forma
   // Não funciona para uma lista de subtipo de Forma
   public static double areaTotal(List<Forma> lista)
   {
      double soma = 0.0;
      for (Forma f : lista)
      {
         soma += f.area();
      }
      return soma;
   }
}
