package set.exercicio_proposto.programa;

// Módulo 04 / Capítulo 16 / aula 10 - Generics, Set e Map
// Exercício proposto de Set

import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      Set<Integer> uniao = new HashSet<>();

      System.out.print("\nQuando estudantes para o curso A? ");
      int a = scanner.nextInt();
      for (int i = 0; i < a; i++)
      {
         uniao.add(scanner.nextInt());
      }

      System.out.print("Quando estudantes para o curso B? ");
      int b = scanner.nextInt();
      for (int i = 0; i < b; i++)
      {
         uniao.add(scanner.nextInt());
      }

      System.out.print("Quando estudantes para o curso C? ");
      int c = scanner.nextInt();
      for (int i = 0; i < c; i++)
      {
         uniao.add(scanner.nextInt());
      }

      System.out.println("Total de estudantes: " + uniao.size());
      scanner.close();
   }
}
