package map.exemplo_1;

// Módulo 04 / Capítulo 16 / aula 12 - Generics, Set e Map
// Exemplo 1 Map

import java.util.Map;
import java.util.TreeMap;

public class Main
{
   public static void main(String[] args)
   {
      Map<String, String> cookies = new TreeMap<>();

      // Inserir elementos no map:
      cookies.put("usuario", "Maria");
      cookies.put("email", "maria@gmail.com");
      cookies.put("telefone", "98888-7777");

      for (String k : cookies.keySet())
      {
         System.out.println(k + ": " + cookies.get(k));
      }

      // Remover um elemento do map:
      cookies.remove("email");
      System.out.println();
      for (String k : cookies.keySet())
      {
         System.out.println(k + ": " + cookies.get(k));
      }

      // Como map não admite repetições, uma nova inserção com uma
      // chave já existente sobrescreve o elemento anterior:
      cookies.put("telefone", "98765-4321");
      System.out.println();
      for (String k : cookies.keySet())
      {
         System.out.println(k + ": " + cookies.get(k));
      }

      // Verificar se existe uma chave no map retorna true ou false:
      System.out.println();
      System.out.println(cookies.containsKey("telefone"));

      // Acessar um valor relativo a uma chave:
      System.out.println();
      System.out.println(cookies.get("usuario"));

      // Se o valor não existe, o map retorna null:
      System.out.println();
      System.out.println(cookies.get("email"));

      // Descobrir o tamanho do map
      System.out.println();
      System.out.println(cookies.size());
   }
}
