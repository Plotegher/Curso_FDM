package generics.hashcode_equals.exemplo_1;

// Módulo 04 / Capítulo 16 / aula 06 - Generics, Set e Map
// Exemplo 1: HashCode e Equals

public class Main
{
   public static void main(String[] args)
   {
      String a = "José";
      String b = "Maria";
      String c = "Mariá";

      System.out.println("a é igual a b? " + a.equals(b));
      if (a == b)
      {
         System.out.println("Iguais");
      }
      else
      {
         System.out.println("Diferentes");
      }

      System.out.println(a.hashCode());
      System.out.println(b.hashCode());
      System.out.println(c.hashCode());
   }
}
