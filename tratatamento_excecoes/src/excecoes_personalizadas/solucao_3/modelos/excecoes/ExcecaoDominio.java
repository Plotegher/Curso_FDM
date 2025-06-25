package excecoes_personalizadas.solucao_3.modelos.excecoes;

public class ExcecaoDominio extends Exception
{
   private static final long serialVersionUID = 1L;

   public ExcecaoDominio(String mensagem)
   {
      super(mensagem);
   }
}
