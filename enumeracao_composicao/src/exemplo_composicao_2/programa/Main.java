package exemplo_composicao_2.programa;

// Módulo 04 / Capítulo 11 / aula 07 - Enumeração e Composição
// Exemplo de composição 2 e uso da classe StringBuilder

import exemplo_composicao_2.entidades.Comentario;
import exemplo_composicao_2.entidades.Postagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main
{
   public static void main(String[] args) throws ParseException
   {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

      Comentario comentario1 = new Comentario("Tenha uma boa viagem");
      Comentario comentario2 = new Comentario("Uau, que legal!");

      Postagem postagem1 = new Postagem
            (sdf.parse("21/06/2018 13:05:44"),
            "Viagem a Nova Zelândia",
            "Vou visitar esse País maravilhoso!",
            12);

      postagem1.adicionarComentario(comentario1);
      postagem1.adicionarComentario(comentario2);
      System.out.println(postagem1);

      Comentario comentario3 = new Comentario("Boa noite");
      Comentario comentario4 = new Comentario("Que a força esteja com você");

      Postagem postagem2 = new Postagem
            (sdf.parse("28/07/2018 23:14:19"),
            "Boa noite pessoal",
            "Vejo vocês amanhã",
            5);

      postagem2.adicionarComentario(comentario3);
      postagem2.adicionarComentario(comentario4);
      System.out.println(postagem2);
   }
}
