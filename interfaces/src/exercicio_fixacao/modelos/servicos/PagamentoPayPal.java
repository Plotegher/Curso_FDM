package exercicio_fixacao.modelos.servicos;

public class PagamentoPayPal implements ServicoPagamento
{
   @Override
   public Double taxa(Double montante)
   {
      return montante * 0.02;
   }

   @Override
   public Double juros(Double montante, Integer meses)
   {
      return montante * 0.01 * meses;
   }
}
