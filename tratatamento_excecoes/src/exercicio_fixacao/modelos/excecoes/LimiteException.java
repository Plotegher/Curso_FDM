package exercicio_fixacao.modelos.excecoes;

import java.io.Serial;

public class LimiteException extends Exception
{
  @Serial
  private static final long serialVersionUID = 1L;

  public LimiteException(String menssagem)
   {
      super(menssagem);
   }
}
