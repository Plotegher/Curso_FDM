package leitura_arquivos.exemplo_1;

// Módulo 04 / Capítulo 14 / aula 02 - Trabalhando com arquivos
// Exemplo 1: Lendo arquivos com classes File e Scanner

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "trabalhando_arquivos\\src\\leitura_arquivos\\exemplo_1\\entrada_1.txt";

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
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
      finally
      {
         if (scanner != null)
         {
            scanner.close();
         }
      }
   }
}
