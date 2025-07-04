package generics.hashcode_equals.exemplo_2.programa;

// Módulo 04 / Capítulo 16 / aula 06 - Generics, Set e Map
// Exemplo 2: HashCode e Equals

import generics.hashcode_equals.exemplo_2.entidades.Cliente;

public class Main
{
   public static void main(String[] args)
   {
      Cliente c1 = new Cliente("Maria", "maria@gmail.com");
      Cliente c2 = new Cliente("Maria", "alex@gmail.com");
      Cliente c3 = new Cliente("Maria", "alex@gmail.com");

      String s1 = "Teste";
      String s2 = "Teste";

      System.out.println("c1.hashCode(): " + c1.hashCode());
      System.out.println("c2.hashCode(): " + c2.hashCode());
      System.out.println("c3.hashCode(): " + c3.hashCode());

      System.out.println("c1.equals(c2): " + c1.equals(c2));
      System.out.println("c2.equals(c3): " + c2.equals(c3));
      // Com "==" o compilador compara as posições em memória e portanto, retorna false
      System.out.println("c1 == c2: " + (c1 == c2));
      // Para literais o compilador retorna true, a menos que se instancie o objeto com new
      System.out.println("s1 == s2: " + (s1 == s2));
   }
}
