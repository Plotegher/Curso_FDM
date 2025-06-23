package desafio_plataforma_de_ensino_poo.entidades;

public class Tarefa extends Aula
{
   private String descricao;
   private Integer questoes;

   public Tarefa(String titulo, String descricao, Integer questoes)
   {
      super(titulo);
      this.descricao = descricao;
      this.questoes = questoes;
   }

   public String getDescricao()
   {
      return descricao;
   }

   public void setDescricao(String descricao)
   {
      this.descricao = descricao;
   }

   public Integer getQuestoes()
   {
      return questoes;
   }

   public void setQuestoes(Integer questoes)
   {
      this.questoes = questoes;
   }

   @Override
   public Integer duracao()
   {
      return questoes * 300;
   }
}
