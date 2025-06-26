package leitura_arquivos.exemplo_3;

// Módulo 04 / Capítulo 14 / aula 04 - Trabalhando com arquivos
// Exemplo 3: Bloco try-with-resources

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "trabalhando_arquivos\\src\\leitura_arquivos\\exemplo_3\\entrada_3.txt";

      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho)))
      {
         String linha = bufferedReader.readLine();
         while (linha != null)
         {
            System.out.println(linha);
            linha = bufferedReader.readLine();
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro : " + e.getMessage());
      }
   }
}
