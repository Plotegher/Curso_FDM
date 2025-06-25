package estrutura_try_catch.exemplo_3;

// Módulo 04 / Capítulo 13 / aula 05 - Tratamento de exceções
// Exemplo 3: Bloco finally

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna";
      caminho += "\\tratatamento_excecoes\\src\\estrutura_try_catch";
      caminho += "\\exemplo_3\\in.txt";
      File file = new File(caminho);
      Scanner scanner = null;

      try
      {
         scanner = new Scanner(file);
         while (scanner.hasNextLine())
         {
            System.out.println(scanner.nextLine());
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
      }
      finally
      {
         if (scanner != null)
         {
            scanner.close();
         }
         System.out.println("Bloco finally executado!");
      }
   }
}
