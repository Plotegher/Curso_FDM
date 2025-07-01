package exemplo_4.programa;

// Módulo 04 / Capítulo 15 / aula 11 - Interfaces
// Exemplo 4: Herança múltipla e o problema do diamante

import exemplo_4.entidades.Escaneador;
import exemplo_4.entidades.Impressora;
import exemplo_4.entidades.Multifuncional;

public class Main
{
   public static void main(String[] args)
   {
      Impressora p = new Impressora("1080");
      p.processaDocumento("Meu ofício");
      p.imprimir("Meu ofício");

      System.out.println();
      Escaneador s = new Escaneador("2003");
      s.processaDocumento("Meu documento");
      System.out.println("Resultado do escaneamento: " + s.escanear());

      System.out.println();
      Multifuncional c = new Multifuncional("2081");
      c.processaDocumento("Meu livro");
      c.imprimir("Meu livro");
      System.out.println("Resultado do escaneamento: " + c.escanear());
   }
}
