package leitura_arquivos.exemplo_2;

// Módulo 04 / Capítulo 14 / aula 03 - Trabalhando com arquivos
// Exemplo 2: Classes FileReader e BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "trabalhando_arquivos\\src\\leitura_arquivos\\exemplo_2\\entrada_2.txt";

      FileReader fileReader = null;
      BufferedReader bufferedReader = null;

      try
      {
         fileReader = new FileReader(caminho);
         bufferedReader = new BufferedReader(fileReader);

         String linha = bufferedReader.readLine();
         while (linha != null)
         {
            System.out.println(linha);
            linha = bufferedReader.readLine();
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
      finally
      {
         try
         {
            if (bufferedReader != null)
            {
               bufferedReader.close();
            }
            if (fileReader != null)
            {
               fileReader.close();
            }
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }
}
