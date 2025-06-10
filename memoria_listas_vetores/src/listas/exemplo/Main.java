package listas.exemplo;

// Módulo 04 / Capítulo 08 / aulas 09 e 10 - Memória, vetores e listas
// Exemplo de lista

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
   public static void main(String[] args)
   {
      System.out.println("EXEMPLO COM NÚMEROS INTEIROS:\n");

      // Cria uma lista
      List<Integer> lista1 = new ArrayList<>();

      // Adiciona itens a lista
      lista1.add(29);
      lista1.add(5);
      lista1.add(19);
      lista1.add(71);
      lista1.add(17);

      System.out.println("Lista original ------------------------------------------------------------");
      for (Integer item : lista1)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista1.size());

      // Adiciona um item a lista em uma posição especificada (0)
      lista1.add(0, 54);
      System.out.println("\nLista após adicionar elemento em uma posição específica (54) ------------");
      for (Integer item : lista1)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista1.size());

      // Remover um item Integer da lista
      lista1.remove(Integer.valueOf(54));
      System.out.println("\nLista após remover um elemento (54) -------------------------------------");
      for (Integer item : lista1)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista1.size());

      // Remover item(ns) da lista com base em um predicado
      lista1.removeIf(item -> item > 54);
      System.out.println("\nLista após remover um elemento baseado em um predicado (> 54) -----------");
      for (Integer item : lista1)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista1.size());

      // Encontrar a posição de um elemento
      System.out.println("\nEncontrar a posição de um elemento --------------------------------------");
      System.out.println("Posição de '19': " + lista1.indexOf(19));

      System.out.println("\nEXEMPLO COM STRINGS:\n");

      // Cria uma lista
      List<String> lista2 = new ArrayList<>();

      // Adiciona itens a lista
      lista2.add("José");
      lista2.add("Maria");
      lista2.add("João");
      lista2.add("Madalena");
      lista2.add("Paulo");
      lista2.add("Pedro");
      lista2.add("Tiago");
      lista2.add("Tadeu");

      // Percorre a lista e imprime seus itens
      System.out.println("Lista original ------------------------------------------------------------");
      for (String item : lista2)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista2.size());

      // Adiciona um item a lista em uma posição especificada (0)
      lista2.add(0, "Tomás");
      System.out.println("\nLista após adicionar elemento em uma posição específica (Tomás) ---------");
      for (String item : lista2)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista2.size());

      // Remover um item Integer da lista
      lista2.remove("Tomás");
      System.out.println("\nLista após remover um elemento (Tomás) ----------------------------------");
      for (String item : lista2)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista2.size());

      // Remover item(ns) da lista com base em um predicado
      lista2.removeIf(item -> item.charAt(0) == 'J');
      System.out.println("\nLista após remover um elemento baseado em um predicado (J) --------------");
      for (String item : lista2)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da lista: " + lista2.size());

      // Encontrar a posição de um elemento
      System.out.println("\nEncontrar a posição de um elemento --------------------------------------");
      System.out.println("Posição de Madalena: " + lista2.indexOf("Madalena"));

      // Passos para filtrar uma lista com base em um predicado:
      /*
         1) Declarar uma nova lista "novaLista"
         2) Converter lista original para um stream "lista2.stream()"
         3) Filtrar com base no predicado ".filter(item -> item.charAt(0) == 'T')"
         4) Converter novamente para lista ".collect(Collectors.toList())"
         OBS: ".collect(Collectors.toList())" pode ser abreviado em ".toList()"
      */
      List<String> novaLista = lista2.stream()
            .filter(item -> item.charAt(0) == 'T')
            .toList();
      System.out.println("\nNova lista após filtrar elemento(s) baseado em um predicado (T)----------");
      for (String item : novaLista)
      {
         System.out.println(item);
      }
      System.out.println("Tamanho da nova lista: " + novaLista.size());

      // Encontrar o 1° elemento de um stream baseado em um predicado
      String nome = novaLista.stream()
            .filter(item -> item.charAt(0) == 'T')
            .findFirst()
            .orElse(null);
      System.out.println("\nEncontrar o 1° elemento de um stream baseado em um predicado (T) --------");
      for (String item : novaLista)
      {
         System.out.println(item);
      }
      System.out.println("1° elemento começado com T: " + nome);
   }
}
