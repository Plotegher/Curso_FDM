package set.exemplo_1;

// Módulo 04 / Capítulo 16 / aula 07 - Generics, Set e Map
// Exemplo 1: Operações .add(), .contains(), .remove() e .removeIf()

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
   public static void main(String[] args)
   {
      Set<String> set_1 = new HashSet<>();
      Set<String> set_2 = new TreeSet<>();
      Set<String> set_3 = new LinkedHashSet<>();

      set_1.add("TV");
      set_1.add("Notebook");
      set_1.add("Tablet");

      set_2.add("José");
      set_2.add("Maria");
      set_2.add("Jesus");

      set_3.add("Honda");
      set_3.add("Toyota");
      set_3.add("Nissan");
      set_3.add("Volkswagen");
      set_3.add("Chevrolet");
      set_3.add("Fiat");
      set_3.add("Ford");
      set_3.add("Renault");
      set_3.add("Citroen");
      set_3.add("Peugeot");

      System.out.println("Contém Notebook no set? " + set_1.contains("Notebook"));

      System.out.println("\nHashSet:");
      for (String s : set_1)
      {
         System.out.println(s);
      }

      System.out.println("\nTreeSet:");
      for (String s : set_2)
      {
         System.out.println(s);
      }

      System.out.println("\nLinkedHashSet:");
      for (String s : set_3)
      {
         System.out.println(s);
      }

      System.out.println("\nREMOVENDO UM ELEMENTO: ");
      System.out.println("set_3.remove(\"Nissan\");");
      set_3.remove("Nissan");
      System.out.println("\nLinkedHashSet:");
      for (String s : set_3)
      {
         System.out.println(s);
      }

      System.out.println("\nREMOVENDO UM ELEMENTO POR PREDICADO: ");
      System.out.println("set_3.removeIf(x -> x.length() > 9);");
      set_3.removeIf(x -> x.length() > 9);
      System.out.println("\nLinkedHashSet:");
      for (String s : set_3)
      {
         System.out.println(s);
      }
   }
}
