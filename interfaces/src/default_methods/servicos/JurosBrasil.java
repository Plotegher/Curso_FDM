package default_methods.servicos;

import default_methods.entidades.ServicoJuros;

public class JurosBrasil implements ServicoJuros
{
   private Double taxaJuros;

   public JurosBrasil(Double taxaJuros)
   {
      this.taxaJuros = taxaJuros;
   }

   @Override
   public Double getTaxaJuros()
   {
      return taxaJuros;
   }
}
