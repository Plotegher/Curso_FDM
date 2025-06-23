package heranca.exemplo_2.entidades;

public class Circulo extends Forma
{
   private static final Double PI = 3.14;
   private Double raio;

   public Circulo(Double raio)
   {
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

   // Método concreto implementado na subclasse concreta.
   @Override
   public Double area()
   {
      return PI * Math.pow(raio, 2);
   }
}
