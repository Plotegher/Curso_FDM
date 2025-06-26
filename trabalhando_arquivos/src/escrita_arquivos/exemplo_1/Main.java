package escrita_arquivos.exemplo_1;

// Módulo 04 / Capítulo 14 / aula 05 - Trabalhando com arquivos
// Exemplo 1: FileWriter e BufferedWriter

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{

   public static void main(String[] args)
   {
      String[] linhas = new String[]
            {"Bom dia", "Boa tarde", "Boa noite"};

      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "trabalhando_arquivos\\src\\escrita_arquivos\\exemplo_1\\saida_1.txt";

      // O segundo argumento opcional de FileWriter escreve a partir do fim
      // do conteúdo já existente.
      try (BufferedWriter bufferedWriter = new BufferedWriter
            (new FileWriter(caminho, true)))
      {
         for (String linha : linhas)
         {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
   }
}
