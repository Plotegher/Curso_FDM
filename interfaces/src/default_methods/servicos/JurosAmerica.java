package default_methods.servicos;

import default_methods.entidades.ServicoJuros;

public class JurosAmerica implements ServicoJuros
{
   private Double taxaJuros;

   public JurosAmerica(Double taxaJuros)
   {
      this.taxaJuros = taxaJuros;
   }

   @Override
   public Double getTaxaJuros()
   {
      return taxaJuros;
   }
}
