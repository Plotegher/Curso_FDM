package escrita_arquivos.exemplo_2;

// Módulo 04 / Capítulo 14 / aulas 06 e 07 - Trabalhando com arquivos
// Exemplo 2: Manipulando pastas com File e Informações do caminho do arquivo

import java.io.File;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\nDigite um caminho: ");
      String caminho_1 = scanner.nextLine();
      File caminhoPastas = new File(caminho_1);

      File[] pastas = caminhoPastas.listFiles(File::isDirectory);
      System.out.println("PASTAS:");
      assert pastas != null;
      for (File pasta : pastas)
      {
         System.out.println(pasta);
      }

      System.out.print("\nDigite um caminho: ");
      String caminho_2 = scanner.nextLine();
      File caminhoArquivos = new File(caminho_2);

      File[] arquivos = caminhoArquivos.listFiles(File::isFile);
      System.out.println("ARQUIVOS:");
      assert arquivos != null;
      for (File arquivo : arquivos)
      {
         System.out.println(arquivo.getParent());
         System.out.println(arquivo.getName());
         System.out.println(arquivo.getPath());
      }

      boolean criaPasta = new File(caminho_1 + "\\NovaPastaTeste").mkdir();
      System.out.println("Pasta criada: " + criaPasta);

      scanner.close();
   }
}
