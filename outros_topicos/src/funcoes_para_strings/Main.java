package funcoes_para_strings;

// Módulo 04 / Capítulo 05 / aula 03 - Funções interessantes para String

public class Main
{
   public static void main(String[] args)
   {
      System.out.println("\n## String original");
      String original = "abcde FGHIJ ABC abc DEFG    ";
      System.out.println("Original: #" + original + "# " + original.length());

      /*
         Formatar:

         - toLowerCase() - converter para minúsculo
         - toUpperCase() - converter para maiúsculo
         - trim() - remover espaços nas extremidades da string
      */

      System.out.println("\n## toLowerCase()");
      String minusculo = original.toLowerCase();
      System.out.println("Minúsculo: #" + minusculo + "#");
      System.out.println("\n## toUpperCase()");
      String maiusculo = original.toUpperCase();
      System.out.println("Maiúsculo: #" + maiusculo + "#");
      System.out.println("\n## trim()");
      String semEspacos = original.trim();
      System.out.println("Sem espaços no fim: #" + semEspacos + "#");

      /*
         Recortar: uma string

         - substring(inicio)
         - substring(inicio, fim)
      */

      System.out.println("\n## substring(inicio)");
      String substringInicio = original.substring(2);
      System.out.println("Substring com início (2): #" + substringInicio + "#");
      System.out.println("\n## substring(inicio, fim)");
      String substringInicioFim = original.substring(2, 22);
      System.out.println("Substring com início e fim (2, 22): #" + substringInicioFim + "#");

      /*
         Substituir: caracteres ou substrings de uma string

         - Replace(char, char)
         - Replace(string, string)
      */

      System.out.println("\n## replace(char, char)");
      String substituindoPorX = original.replace('a', 'x');
      System.out.println("Substituindo 'a' por 'x': #" + substituindoPorX + "#");
      System.out.println("\n## replace(string, string)");
      String substituindoPorXY = original.replace("FG", "XY");
      System.out.println("Substituindo \"FG\" por \"XY\": #" + substituindoPorXY + "#");

      /*
         Buscar: a posição de alguma parte da string
         - IndexOf
         - LastIndexOf
      */

      System.out.println("\n## indexOf()");
      int posicao1 = original.indexOf("FG");
      System.out.println("Primeira ocorrência de FG: " + posicao1);
      System.out.println("\n## lastIndexOf()");
      int posicao2 = original.lastIndexOf("FG");
      System.out.println("Última ocorrência de FG: " + posicao2);

      /*
         str.Split(" ") - para recortar uma string baseado em um separador
      */

      System.out.println("\n## split()");
      String string = "batata limão maça";
      System.out.println(string);
      String[] vetor = string.split(" ");
      String palavra1 = vetor[0];
      String palavra2 = vetor[1];
      String palavra3 = vetor[2];
      System.out.println("Palavra 1: " + palavra1);
      System.out.println("Palavra 2: " + palavra2);
      System.out.println("Palavra 3: " + palavra3);
   }
}
