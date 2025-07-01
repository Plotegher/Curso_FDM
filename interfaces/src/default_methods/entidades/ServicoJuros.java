package default_methods.entidades;

import java.security.InvalidParameterException;

public interface ServicoJuros
{
   Double getTaxaJuros();

   default Double pagamento(Double montante, Integer meses)
   {
      if (meses < 1)
      {
         throw new InvalidParameterException("A quantidade de meses deve ser maior que ZERO!");
      }
      return montante * Math.pow((1 + getTaxaJuros() / 100), meses);
   }
}
