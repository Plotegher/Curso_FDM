package exercicio_fixacao.modelos.excecoes;

import java.io.Serial;

public class SaldoException extends Exception
{
  @Serial
  private static final long serialVersionUID = 1L;

  public SaldoException(String menssagem)
   {
      super(menssagem);
   }
}
