package exemplo_3.modelos.entidades;

import exemplo_3.modelos.enumeracoes.Cor;

public class Circulo extends FiguraAbstrata
{
   private Double raio;

   public Circulo(Cor cor, Double raio)
   {
      super(cor);
      this.raio = raio;
   }

   public Double getRaio()
   {
      return raio;
   }

   public void setRaio(Double raio)
   {
      this.raio = raio;
   }

   @Override
   public Double area()
   {
      return Math.PI * Math.pow(raio, 2);
   }
}
