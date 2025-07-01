package exemplo_2.modelos.servicos;

public class ImpostoBrasil implements Imposto
{
   public Double calculaImposto(Double valor)
   {
      if (valor <= 100.0)
      {
         return valor * 0.20;
      }
      else
      {
         return valor * 0.15;
      }
   }
}
