package exercicio_fixacao.modelos.servicos;

import exercicio_fixacao.modelos.entidades.Contrato;
import exercicio_fixacao.modelos.entidades.Parcela;

import java.time.LocalDate;

public class ServicoContrato
{
   private ServicoPagamento servicoPagamento;

   public ServicoContrato(ServicoPagamento servicoPagamento)
   {
      this.servicoPagamento = servicoPagamento;
   }

   public void processaContrato(Contrato contrato, Integer meses)
   {
      double base = contrato.getValorTotal() / meses;
      for (int i = 1; i <= meses; i++)
      {
         LocalDate vencimento = contrato.getData().plusMonths(i);

         double juros = servicoPagamento.juros(base, i);
         double taxa = servicoPagamento.taxa(base + juros);
         double quota = base + juros + taxa;

         contrato.getParcelas().add(new Parcela(vencimento, quota));
      }
   }
}
