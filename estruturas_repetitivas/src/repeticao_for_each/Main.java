package repeticao_for_each;

// Módulo 04 / Capítulo 04 / aula ? - Estrutura repetitiva for-each (para-cada)

import java.util.ArrayList;
import java.util.List;

public class Main
{
   public static void main(String[] args)
   {
      List<Integer> inteiros = new ArrayList<>();
      // For normal
      for (int j = 0; j < 10; j++)
      {
         inteiros.add(j);
      }
      System.out.println(inteiros);

      List<Integer> multiplos = new ArrayList<>();
      // For-each
      for (Integer i : inteiros)
      {
         i *= 2;
         multiplos.add(i);
      }
      System.out.println(multiplos);
   }
}
