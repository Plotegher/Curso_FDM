package exercicio_fixacao.modelos.servicos;

public interface ServicoPagamento
{
   public Double taxa(Double montante);
   public Double juros(Double montante, Integer meses);
}
