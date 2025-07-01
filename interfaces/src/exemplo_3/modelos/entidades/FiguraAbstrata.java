package exemplo_3.modelos.entidades;

import exemplo_3.modelos.enumeracoes.Cor;

// A palavra reservada abstract informa ao compilador que a
// classe FiguraAbstrata implementa a interface Figura sem
// a obrigação de implementar o contrato "public Double area()".

public abstract class FiguraAbstrata implements Figura
{
   private Cor cor;

   public FiguraAbstrata(Cor cor)
   {
      this.cor = cor;
   }

   public Cor getCor()
   {
      return cor;
   }

   public void setCor(Cor cor)
   {
      this.cor = cor;
   }
}
