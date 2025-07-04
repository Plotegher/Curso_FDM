package exemplo_composicao_2.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem
{
   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

   private Date momento;
   private String titulo;
   private String conteudo;
   private Integer likes;

   private List<Comentario> comentarios = new ArrayList<>();

   public Postagem(Date momento, String titulo, String conteudo, Integer likes)
   {
      this.momento = momento;
      this.titulo = titulo;
      this.conteudo = conteudo;
      this.likes = likes;
   }

   public Date getMomento()
   {
      return momento;
   }

   public void setMomento(Date momento)
   {
      this.momento = momento;
   }

   public String getTitulo()
   {
      return titulo;
   }

   public void setTitulo(String titulo)
   {
      this.titulo = titulo;
   }

   public String getConteudo()
   {
      return conteudo;
   }

   public void setConteudo(String conteudo)
   {
      this.conteudo = conteudo;
   }

   public Integer getLikes()
   {
      return likes;
   }

   public void setLikes(Integer likes)
   {
      this.likes = likes;
   }

   public List<Comentario> getComentarios()
   {
      return comentarios;
   }

   public void adicionarComentario(Comentario comentario)
   {
      comentarios.add(comentario);
   }

   public void removerComentario(Comentario comentario)
   {
      comentarios.remove(comentario);
   }

   @Override
   public String toString()
   {
      StringBuilder sbd = new StringBuilder();
      sbd.append(titulo);
      sbd.append("\n");
      sbd.append(likes);
      sbd.append(" likes - ");
      sbd.append(sdf.format(momento));
      sbd.append("\n");
      sbd.append(conteudo);
      sbd.append("\n");
      sbd.append("Comentários:");
      sbd.append("\n");
      for (Comentario c : comentarios)
      {
         sbd.append(c.getTexto());
         sbd.append("\n");
      }
      return sbd.toString();
   }
}
