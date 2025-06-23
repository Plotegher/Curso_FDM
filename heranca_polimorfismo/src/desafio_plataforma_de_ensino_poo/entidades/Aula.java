package desafio_plataforma_de_ensino_poo.entidades;

public abstract class Aula
{
   private String titulo;

   public Aula(String titulo)
   {
      this.titulo = titulo;
   }

   public String getTitulo()
   {
      return titulo;
   }

   public void setTitulo(String titulo)
   {
      this.titulo = titulo;
   }

   public abstract Integer duracao();
}
