package repeticao_while;

// Módulo 04 / Capítulo 04 / aula 03 - Estrutura repetitiva while (enquanto)

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main
{
   public static void main(String[] args)
   {
      Random random = new Random();
      Set<Integer> set = new HashSet<>();

      while (set.size() < 15)
      {
         int numero = random.nextInt(26);
         set.add(numero);
      }
      System.out.println(set);
   }
}